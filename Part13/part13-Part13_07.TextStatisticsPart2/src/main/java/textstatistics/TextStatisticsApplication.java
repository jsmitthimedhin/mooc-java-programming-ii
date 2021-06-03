package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;


public class TextStatisticsApplication extends Application {
    
    public void start(Stage window) {
        BorderPane base = new BorderPane();
        TextArea textArea = new TextArea("");
        base.setCenter(textArea);
        
        Label textComp1 = new Label("Letters: 0");
        Label textComp2 = new Label("Words: 0");
        Label textComp3 = new Label("The longest word is:");
        
        HBox newBox = new HBox();
        newBox.setSpacing(10);
        newBox.getChildren().add(textComp1);
        newBox.getChildren().add(textComp2);
        newBox.getChildren().add(textComp3);
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
        int characters = newValue.length();
        String[] parts = newValue.split(" ");
        int words = parts.length;
        String longest = Arrays.stream(parts)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();
        textComp1.setText(String.valueOf("Letters: " + characters));
        textComp2.setText(String.valueOf("Words: " + words));
        textComp3.setText(String.valueOf("The longest word is: " + longest));
        });
        
        
        base.setBottom(newBox);
        
        Scene view = new Scene(base);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
