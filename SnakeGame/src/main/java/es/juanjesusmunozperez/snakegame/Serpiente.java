/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.juanjesusmunozperez.snakegame;

/**
 *
 * @author usuario
 */
public class Serpiente {
    
    int tamXSnake;
    int tamYSnake;
    int [][] serpiente;
    
    public Serpiente (){
        tamXSnake = 8;
        tamYSnake = 1;
        serpiente = new int [tamXSnake][tamYSnake];
        
    
    }
    
}
