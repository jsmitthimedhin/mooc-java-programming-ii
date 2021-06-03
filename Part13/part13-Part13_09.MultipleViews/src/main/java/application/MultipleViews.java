package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    public void start(Stage window) {
//        First scene components
        BorderPane base1 = new BorderPane();
        Label firstView = new Label("First view!");
        Button moveToSecondBtn = new Button("To the second view!");
        base1.setTop(firstView);
        base1.setCenter(moveToSecondBtn);
        Scene first = new Scene(base1);
        
//        Second scene components
        VBox base2 = new VBox();
        Button moveToThirdBtn = new Button("To the third view!");
        Label secondView = new Label("Second view!");
        base2.getChildren().add(moveToThirdBtn);
        base2.getChildren().add(secondView);
        Scene second = new Scene(base2);
        
//        Third scene components
        GridPane base3 = new GridPane();
        Label thirdView = new Label("Third view!");
        Button moveToFirstBtn = new Button("To the first view!");
        base3.add(thirdView, 0, 0);
        base3.add(moveToFirstBtn, 1, 1);
        Scene third = new Scene(base3);
        
//        Event handlers
        moveToFirstBtn.setOnAction((event) -> {
            window.setScene(first);
        });
        moveToSecondBtn.setOnAction((event) -> {
            window.setScene(second);
        });
        moveToThirdBtn.setOnAction((event) -> {
            window.setScene(third);
        });
        
//        Initial state
        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
