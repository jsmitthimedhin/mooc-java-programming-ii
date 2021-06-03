package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;


public class TextStatisticsApplication extends Application {
    
    public void start(Stage window) {
        BorderPane base = new BorderPane();
        base.setCenter(new TextArea(""));
        
        Label textComp1 = new Label("Letters: 0");
        Label textComp2 = new Label("Words: 0");
        Label textComp3 = new Label("The longest word is:");
        
        HBox newBox = new HBox();
        newBox.setSpacing(10);
        newBox.getChildren().add(textComp1);
        newBox.getChildren().add(textComp2);
        newBox.getChildren().add(textComp3);
        
        base.setBottom(newBox);
        
        Scene view = new Scene(base);

        window.setScene(view);
        window.show();
        
    }



    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
