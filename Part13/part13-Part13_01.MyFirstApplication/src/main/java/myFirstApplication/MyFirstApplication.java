/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author OS
 */
public class MyFirstApplication extends Application {
    
    public void start(Stage window) {
        window.setTitle("My first application");
        window.show();
    }
    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }
}
