import javafx.application.Application;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;

class Output extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("X: ");
        yAxis.setLabel("Y: ");
        LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);
    }
}


public class Graph {
    public static void main(String[] args){

    }
}
