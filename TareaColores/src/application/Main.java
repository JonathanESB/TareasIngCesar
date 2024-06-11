package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();
        Label colorLabel = new Label("Escoge tu color preferido:");
        ColorPicker colorPicker = new ColorPicker();
        Button submitButton = new Button("Confirmar");

        submitButton.setOnAction(e -> {
            String selectedDate = datePicker.getValue() != null ? datePicker.getValue().toString() : "Ninguna fecha seleccionada";
            String selectedColor = colorPicker.getValue() != null ? colorPicker.getValue().toString() : "Ningún color escogido";
            System.out.println("Fecha Seleccionada: " + selectedDate);
            System.out.println("Color Escogido: " + selectedColor);
        });

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20, 20, 20, 20));
        vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, submitButton);

        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setTitle("Controles DatePicker y ColorPicker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
