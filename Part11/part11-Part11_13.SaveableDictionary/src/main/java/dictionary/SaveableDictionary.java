/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author OS
 */
public class SaveableDictionary {
    private HashMap<String, String> dictionaryList = new HashMap<>();
    private String file;
    
    public SaveableDictionary() {
        
    }
    
    public SaveableDictionary(String file) {
        this.file = file;
    }
    
    public boolean load() {
        try {
            Files.lines(Paths.get(file))
                    .map(word -> word.split(":"))
                    .forEach(parts -> {
                        dictionaryList.put(parts[0], parts[1]);
                        dictionaryList.put(parts[1], parts[0]);
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    
    public void add(String words, String translation) {
        dictionaryList.putIfAbsent(words, translation);
        
    }
    
    public String translate(String word) {
        if(dictionaryList.get(word)==null) {
            for(String e: dictionaryList.keySet()) {
                if(dictionaryList.get(e).equals(word)) {
                    return e;
                }
            }
        }
        return dictionaryList.get(word);
    }
    
    public void delete(String word) {
        String translation = translate(word);
        dictionaryList.remove(word);
        dictionaryList.remove(translation);
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (Exception e) {
            return false;
        } 
        return true;
    }
    
    public void saveWords(PrintWriter writer) {
        List<String> savedWords = new ArrayList<>();
        dictionaryList.keySet().stream().forEach(word -> {
            if(savedWords.contains(word)) {
                return;
            } 
            String newWord = word + ":" + dictionaryList.get(word);
            writer.println(newWord);
            savedWords.add(word);
            savedWords.add(dictionaryList.get(word));
        });
    }
}
