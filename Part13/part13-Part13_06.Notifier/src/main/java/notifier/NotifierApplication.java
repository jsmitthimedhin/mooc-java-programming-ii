package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {
    
    public void start(Stage window) {
//        Components
        VBox box = new VBox();
        
        TextField textField = new TextField();
        box.getChildren().add(textField);
        
        Button updateBtn = new Button("Update");
        box.getChildren().add(updateBtn);
        
        Label textComp = new Label("");
        box.getChildren().add(textComp);
        
//        Event handlers
        updateBtn.setOnAction((event) -> {
            textComp.setText(textField.getText());
        });
        
        Scene scene = new Scene(box);
        
        window.setScene(scene);
        window.show();
        
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
