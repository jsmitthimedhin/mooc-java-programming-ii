
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }
    
    public Parent getView() {
//        Components
        GridPane layout = new GridPane();
        Label instruction = new Label("Translate the word '" + word + "'");
        TextField answerField = new TextField();
        Button submitBtn = new Button("Submit");
        Label feedback = new Label("");
        
//        Styling
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
//        Adding components to layout
        layout.add(instruction, 0, 0);
        layout.add(answerField, 0, 1);
        layout.add(submitBtn, 0, 2);
        layout.add(feedback, 0, 3);
        
//        Event handling
        submitBtn.setOnAction((event) -> {
            String translation = answerField.getText();
            if(dictionary.getTranslation(word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation for " + word + "is '" + dictionary.getTranslation(word) + "'");
                return;
            }
            word = dictionary.getRandomWord();
            instruction.setText("Translate the word '" + word + "'");
            answerField.clear();
        });
        
        return layout;
    }
}
