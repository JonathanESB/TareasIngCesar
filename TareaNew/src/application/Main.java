package application;

import javafx.application.Application; 
import javafx.geometry.Insets;
import javafx.scene.Scene; 
import javafx.scene.control.*;
import javafx.scene.layout.GridPane; 
import javafx.stage.Stage;

public class Main extends Application {
public static void main(String[] args) { launch(args); }

@Override
public void start(Stage primaryStage) { primaryStage.setTitle("Controles: ");

Button button = new Button("Button");
CheckBox checkBox = new CheckBox("CheckBox"); Hyperlink hyperlink = new Hyperlink("Hyperlink");
ToggleButton toggleButton = new ToggleButton("ToggleButton"); RadioButton radioButton = new RadioButton("RadioButton");
Label label = new Label("Label"); TextField textField = new TextField();
PasswordField passwordField = new PasswordField(); TextArea textArea = new TextArea();
ProgressIndicator progressIndicator = new ProgressIndicator(); ProgressBar progressBar = new ProgressBar();
Slider slider = new Slider();

GridPane gridPane = new GridPane(); gridPane.setHgap(10); gridPane.setVgap(10);
gridPane.setPadding(new Insets(10, 10, 10, 10));

// Controles
gridPane.add(new Label("Button:"), 0, 0);
gridPane.add(button, 1, 0);

gridPane.add(new Label("CheckBox:"), 0, 1);
gridPane.add(checkBox, 1, 1);

gridPane.add(new Label("Hyperlink:"), 0, 2);
gridPane.add(hyperlink, 1, 2);

gridPane.add(new Label("ToggleButton:"), 0, 3);
gridPane.add(toggleButton, 1, 3);

gridPane.add(new Label("RadioButton:"), 0, 4);
gridPane.add(radioButton, 1, 4);

gridPane.add(new Label("Label:"), 0, 5);
gridPane.add(label, 1, 5);

gridPane.add(new Label("TextField:"), 0, 6);
gridPane.add(textField, 1, 6);

gridPane.add(new Label("PasswordField:"), 0, 7);
gridPane.add(passwordField, 1, 7);

gridPane.add(new Label("TextArea:"), 0, 8);
gridPane.add(textArea, 1, 8);

gridPane.add(new Label("ProgressIndicator:"), 0, 9);
gridPane.add(progressIndicator, 1, 9);

gridPane.add(new Label("ProgressBar:"), 0, 10);
gridPane.add(progressBar, 1, 10);

gridPane.add(new Label("Slider:"), 0, 11);
gridPane.add(slider, 1, 11);

Scene scene = new Scene(gridPane, 300, 500); 
primaryStage.setScene(scene); 
primaryStage.show(); }
}
