package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    
    public void start(Stage window) {
//        Components for the initial state
        Label instructionText = new Label("Enter your name and start");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");
        
//        Creating the layout
        GridPane layout = new GridPane();
        layout.add(instructionText, 0, 0);
        layout.add(nameField, 0, 1);
        layout.add(startButton, 0, 2);
        
//        Styling the layout & adding to initial scene
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        Scene initialScene = new Scene(layout);
        
//        2nd scene w/ same layout - Welcome message
        Label welcomeText = new Label("");
        GridPane layout2 = new GridPane();
        layout2.add(welcomeText, 0, 1);
        layout2.setPrefSize(300, 180);
        layout2.setVgap(10);
        layout2.setHgap(10);
        layout2.setPadding(new Insets(20, 20, 20, 20));
        layout2.setAlignment(Pos.CENTER);
        Scene welcomeScene = new Scene(layout2);
        
//        Event handling
        startButton.setOnAction((event) -> {
            welcomeText.setText("Welcome " + nameField.getText() + "!");
            window.setScene(welcomeScene);
        });
        
//        Initial state
        window.setScene(initialScene);
        window.show();
}
    
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
