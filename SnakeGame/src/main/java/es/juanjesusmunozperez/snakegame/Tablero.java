package es.juanjesusmunozperez.snakegame;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author usuario
 */
public class Tablero extends Pane {
    
    int tablero [][];
    short tamXTablero;
    short tamYTablero;
    
    
    public Tablero(){
        //Darle color al fondo de la pantalla en el metodo que se ha creado para generar el panel
        //Se podria poner una imagen tambien
        tamXTablero=100;
        tamYTablero=100;
        
        this.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));
        
        //aqui ira el tamaño de la pantalla, mirar la forma en la que esta hecha la clase tablero del cuatro en ralla 
        
    }
    
    public void colocarObjetos(){
        //aqui los objetos de comida, tanto como la serpiente. Si hubiera que meter aletoriedad de algo
        //aqui se meterian los obstaculos que serian aleatorios y habria que definir otro metodo dentro
        //de esta clase
    }
    
    //Hacer aqui tambien el movimiento de la serpiente
    
    //hacer tambien la aletoriedad de la comida y como sale en el tablero
    
    //en el caso de que los haya, aletoriedad de obstaculos
    
}
