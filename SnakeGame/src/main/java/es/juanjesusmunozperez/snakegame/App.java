package es.juanjesusmunozperez.snakegame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        var label = new Label();
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
        
        /*Hacer tablero
        Hacer serpiente
        Comida serpiente
        Movimiento de la serpiente
        puntuacion
        boton de inicio
        boton de reseteo
        
        */
    }

    public static void main(String[] args) {
        launch();
    }

}