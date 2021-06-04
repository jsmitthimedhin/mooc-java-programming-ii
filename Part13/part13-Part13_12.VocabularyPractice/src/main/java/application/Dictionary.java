package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Dictionary {
    private List<String> words;
    private Map<String, String> translations;
    
    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();     
        add("sana", "word");
    }
    
    public void add(String word, String translation) {
        if(!translations.containsKey(word)) {
            words.add(word);
        }
        
        translations.put(word, translation);
    }
    
    public String getTranslation(String word) {
        return translations.get(word);
    }
    
    public String getRandomWord() {
        Random random = new Random();
        String randomWord = words.get(random.nextInt(words.size()));
        return randomWord;
    }
}
