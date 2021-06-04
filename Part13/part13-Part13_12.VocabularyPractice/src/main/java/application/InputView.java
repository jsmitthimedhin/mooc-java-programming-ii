
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {
//        Components of the initial view
        GridPane layout = new GridPane();
        
        Label wordInstruction = new Label("Word:");
        TextField wordInput = new TextField();
        Label translationInstruction = new Label("Translation:");
        TextField translationInput = new TextField();
        Button addWordBtn = new Button("Add word");
        
//        Styling
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
//      Adding components to the layout
        layout.add(wordInstruction, 0, 1);
        layout.add(wordInput, 0, 2);
        layout.add(translationInstruction, 0, 3);
        layout.add(translationInput, 0, 4);
        layout.add(addWordBtn, 0, 5);
        
//        Event handling
        addWordBtn.setOnAction((event) -> {
           String word = wordInput.getText();
           String translation = translationInput.getText();
           
           dictionary.add(word, translation);
           wordInput.clear();
           translationInput.clear();
        });
        
        return layout;
    }
    
}
