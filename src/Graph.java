import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;



public class Graph extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("X: ");
        yAxis.setLabel("Y: ");
        LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle("Näherungsverfahren");
        XYChart.Series series = new XYChart.Series();
        series.setName("LUL");
        for (double i = 0; i < 100; i+=0.1) {
            series.getData().add(new XYChart.Data(i,Math.pow(i,2)));
        }
        for (double i = 0; i > -100; i-=0.1) {
            series.getData().add(new XYChart.Data(i,Math.pow(i,2)));
        }
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);

    }
}
