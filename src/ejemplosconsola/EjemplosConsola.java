/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjemplosConsola {
    
    //Declaro un array de ints de instancia
    int[] listaNumeros ={200, 41, 27, 50, 99, 5};
    
    /*
    El método máximo va a calcular el máximo y el segundo máximo de una lista de numeros
    */
    private int[] maximos (int[] lista){
        //declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int [] listaMaximos = {lista[0], lista[0]};
        for (int i=0; i< lista.length; i++){
            if (listaMaximos[0] < lista[i]){
                listaMaximos[1] = listaMaximos[0];
                listaMaximos[0] = lista[i];
                
                
            }
        }
        
        
        return listaMaximos;
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
    }
    
    
}