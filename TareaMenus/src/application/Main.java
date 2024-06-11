package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");

        MenuItem nuevoArchivo = new MenuItem("Nuevo");
        MenuItem abrirArchivo = new MenuItem("Abrir");
        MenuItem guardarArchivo = new MenuItem("Guardar");
        MenuItem salir = new MenuItem("Salir");

        menuArchivo.getItems().addAll(nuevoArchivo, abrirArchivo, guardarArchivo, new SeparatorMenuItem(), salir);

        MenuItem cortar = new MenuItem("Cortar");
        MenuItem copiar = new MenuItem("Copiar");
        MenuItem pegar = new MenuItem("Pegar");

        menuEditar.getItems().addAll(cortar, copiar, pegar);

        MenuItem acercaDe = new MenuItem("Acerca de");
        menuAyuda.getItems().add(acercaDe);
        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        nuevoArchivo.setOnAction(e -> System.out.println("Usted a creado un nuevo archivo"));
        abrirArchivo.setOnAction(e -> System.out.println("Archivo abierto"));
        guardarArchivo.setOnAction(e -> System.out.println("Archivo guardado"));
        salir.setOnAction(e -> System.out.println("Saliendo de la aplicación"));
        cortar.setOnAction(e -> System.out.println("Cortar texto"));
        copiar.setOnAction(e -> System.out.println("Copiar texto"));
        pegar.setOnAction(e -> System.out.println("Pegar texto"));
        acercaDe.setOnAction(e -> System.out.println("Acerca de esta aplicación"));

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 800, 600);
        primaryStage.setTitle("Implementación de un Sistema de Menús en una Aplicación JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
