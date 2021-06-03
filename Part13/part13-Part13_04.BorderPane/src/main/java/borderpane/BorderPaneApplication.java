package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {
    
    @Override
    public void start(Stage window) {
        Label North = new Label("NORTH");
        Label South = new Label("SOUTH");
        Label East = new Label("EAST");
        
        BorderPane layout = new BorderPane();
        layout.setTop(North);
        layout.setBottom(South);
        layout.setRight(East);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
