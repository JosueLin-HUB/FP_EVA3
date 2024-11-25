/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_return;

/**
 *
 * @author elfor
 */
public class EVA3_2_return {

    public static void main(String[] args) {
        //invocar o llamar al metodo
        //si regresa un resultado, podemos hacer dos cosas
        //hacer algo con el valor
            //guardarlo y usar varias veces
            int valor;
            valor=sumarDosEnteros(100,50);
            System.out.println("Resultado = "+valor);
            //usarlo una vez
            System.out.println("Resultado = "+sumarDosEnteros(100,50));
        //ignorarlo
        sumarDosEnteros(100,50);
        
        
    }
    //sumar dos enteros
    public static int sumarDosEnteros(int num,int num2){
        int resu;
        resu = num + num2;
        
        return resu;
        
    }
        
    
    

}
