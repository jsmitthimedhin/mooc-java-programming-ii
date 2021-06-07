package application;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
//        Components
        BorderPane sliderPane1 = new BorderPane();
        BorderPane sliderPane2 = new BorderPane();
        Slider slider1 = new Slider(25, 250, 25);
        Slider slider2 = new Slider(0, 10, 0);
        Label monthlySavingsLabel = new Label("Monthly savings");
        Label monthlySavingsNum = new Label("" + slider1.getValue());
        Label yearlyInterestLabel = new Label("Yearly interest rate");
        Label yearlyInterestNum = new Label("" + slider2.getValue()); 
        VBox box = new VBox();

//        Styling
        slider1.setSnapToTicks(true);
        slider1.setBlockIncrement(500);
        slider1.setShowTickMarks(true);
        slider1.setShowTickLabels(true);
        slider2.setMinorTickCount(10);
        slider2.setShowTickMarks(true);
        slider2.setShowTickLabels(true);
                
//        Line chart components
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings calculator");
        
        XYChart.Series savingsData = new XYChart.Series();
        XYChart.Series savingsWithInterestData = new XYChart.Series();
        lineChart.getData().add(savingsData);
        lineChart.getData().add(savingsWithInterestData);
        
        slider1.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            int savings = newvalue.intValue();
            monthlySavingsNum.setText("" + savings);

            updateSavings(slider1.getValue(), slider2.getValue(), savingsData, savingsWithInterestData);
        });
        
        slider2.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            yearlyInterestNum.setText("" + newvalue);

            updateSavings(slider1.getValue(), slider2.getValue(), savingsData, savingsWithInterestData);
        });
        
//        Organizing components
        layout.setCenter(lineChart);
        sliderPane1.setLeft(monthlySavingsLabel);
        sliderPane1.setCenter(slider1);
        sliderPane1.setRight(monthlySavingsNum);
        sliderPane2.setLeft(yearlyInterestLabel);
        sliderPane2.setCenter(slider2);
        sliderPane2.setRight(yearlyInterestNum);
        box.getChildren().addAll(sliderPane1, sliderPane2);
        layout.setTop(box);
        
//        
        Scene view = new Scene(layout, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
    
    private void updateSavings(double savings, double interest,  XYChart.Series  savingsData, XYChart.Series savingsWithInterestData) {
//        Gets rid of old figures in the data
        savingsData.getData().clear();
        savingsWithInterestData.getData().clear();

//        Creating new data that begins at 0,0
        savingsData.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestData.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 0; i < 31; i++) {
            savingsData.getData().add(new XYChart.Data(i, savs));
            savingsWithInterestData.getData().add(new XYChart.Data(i, intrs));

            savs += savings * 12;
            intrs = (intrs + savings * 12) * (1.0 + interest / 100.0);
        }
    };
}
