package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {
    private Dictionary dictionary;
    
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }
    
    public void start(Stage stage) throws Exception { 
//        Setting up the views
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);
        
//        Create layout
        BorderPane layout = new BorderPane();
        
//        Components 
        HBox menu = new HBox();
        Button enterBtn = new Button("Enter new words");
        Button practiceBtn = new Button("Practice");
        
//        Styling
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
//        Adding components to the layout
        menu.getChildren().addAll(enterBtn, practiceBtn);
        layout.setTop(menu);
        
//        Event handling
        enterBtn.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceBtn.setOnAction((event) -> {
            layout.setCenter(practiceView.getView());
        });
        
//        Initial state
        layout.setCenter(inputView.getView());
        Scene view = new Scene(layout, 400, 300);
        stage.setScene(view);
        stage.show();
    }


    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
