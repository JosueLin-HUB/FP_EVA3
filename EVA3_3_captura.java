/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA3_3_captura {

    public static void main(String[] args) {
        
        String nombre=capturarTexto("introduce tu nombre");
        String apellido=capturarTexto("introduce tu apellido");
        int edad= capturarEnteros("Introduce tu edad");
        double salario= capturarDobles("Introduce tu Salario");
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu salario es: "+salario);
        
    }
    
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = captu.nextLine();
        return texto;
        
    }
    
    public static int capturarEnteros(String entero){
        Scanner captu = new Scanner(System.in);
        int edad;
        System.out.println(entero);
        edad= captu.nextInt();
        return edad;
    }
    
    
    public static double capturarDobles(String doble){
        Scanner captu = new Scanner(System.in);
        double salario;
        System.out.println(doble);
        salario= captu.nextDouble();
        return salario;
    }
}
