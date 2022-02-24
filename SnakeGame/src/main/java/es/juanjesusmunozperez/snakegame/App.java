package es.juanjesusmunozperez.snakegame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 640;
        short tamYPantalla = 480;
        
        Pane paneRoot = new Pane();
        
        var scene = new Scene (paneRoot, tamXPantalla, tamYPantalla);
        stage.setTitle("SnakeGame");                              
        stage.setScene(scene);
        stage.show();
        
        Tablero tablero = new Tablero();
        paneRoot.getChildren().add(tablero);
        
        
        
        /*Hacer tablero
        Hacer serpiente
        Comida serpiente
            Aletoriedad en la comida
        Movimiento de la serpiente
        puntuacion
        boton de inicio
        boton de reseteo
        crear pantalla
        Hacer una segunda serpiente que quite comida al jugador, asignandole una ¿IA?
        esta segunda serpiente habria que meterla cuando se le suba el nivel de dificultad a la serpiente
            (Hacer que un numero limitado de comida, para la complegidad)
        
        */
    }

    public static void main(String[] args) {
        launch();
    }

}