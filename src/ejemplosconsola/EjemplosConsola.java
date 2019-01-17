/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.sql.DriverManager;
import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjemplosConsola {
    
    //Declaro un array de ints de instancia
    int[] listaNumeros ={33, 303, 303, 30, 5, 9};
    
    /*
    El método máximo va a calcular el máximo y el segundo máximo de una lista de numeros
    */
    private int[] maximos (int[] lista){
        
        //declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int [] listaMaximos = {lista[0], lista[0]};
        //Inicializo listaMaximos[1] a un numero inferior a listaMaximos[0]
        if (listaMaximos[0] >= 0){
            listaMaximos[1] = listaMaximos[0] - listaMaximos[0]; //En caso de que inicialmente sea positivo
        }
        else{
            listaMaximos[1] = listaMaximos[0] + listaMaximos[0]; //En caso de que inicialmente sea negativo
        }
        for (int i=0; i< lista.length; i++){ //Este for determina el valor de listaMaximos[0]
           for (int j=0; j< lista.length; j++){ //Este, el valor de listaMaximos[1]
                if (listaMaximos[0] < lista[i] && lista[i] != listaMaximos[1]){ 
                    //Compruebo que el valor de listaMaximos[0] sea menor a cada valor de la listaNumeros 
                    //y, además, ese valor no sea el que ya ocupa listaMaximos[1]
                    listaMaximos[0] = lista[i];   
                    //De esta manera obtenemos el segundo máximo
                }
                if (listaMaximos[1] < lista[j] || listaMaximos[1] == listaMaximos[0]){
                    //comprobamos que el valor de listaMaximos[1] sea menor al que estamos comprobando en la lista
                    //Además, es importante comprobar que listaMaximos[1] sea igual al listaMaximos[0], ya que si no, obtendriamos
                    //el mismo valor en ambas casillas si, por casualidad, el numero más alto resulta estar en la primera posicion
                    //de la lista
                    listaMaximos[1] = lista[j];
                    //Como es menor, lo usamos como valor maximo
                }
            }    
        }
        
        
        return listaMaximos;
        //devuelve el valor de los 2 maximos
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
    }
    
    
}
