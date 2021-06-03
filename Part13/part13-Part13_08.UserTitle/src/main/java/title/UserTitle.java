package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;


public class UserTitle extends Application {

    @Override
    public void start(Stage window) {
        System.out.println("Please input the title for your program");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        window.setTitle(title);
        window.show();
    }
}