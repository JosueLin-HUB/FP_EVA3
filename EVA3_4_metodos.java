/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA3_4_metodos {

    public static void main(String[] args) {
        System.out.println("mayor de 7 y 8 = "+ buscarMayor(7, 8));
        
        int dia =buscarDia("Dame un numero de dia");
        
    }
    //determinar si un numero es mayor
    public static int buscarMayor(int num1 ,int num2){
        
        int resu;
        if(num1 > num2){
            resu = num1;
        }else
            resu = num2;
        return resu;
        }
    //determinar el dia de la semana 
    public static int buscarDia(String mensaje){
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        dia = captu.nextInt();
        
        
         switch(dia){
            case 1:
                System.out. println("El dia es Lunes");
                break;
            case 2:
                System.out. println("El dia es Martes");
                break;
            case 3:
                System.out. println("El dia es Miercoles");
                break;
            case 4:
                System.out. println("El dia es Jueves");
                break;
            case 5:
                System.out. println("El dia es Viernes");
                break;
            case 6:
                System.out. println("El dia es Sabado");
                break;
            case 7:
                System.out. println("El dia es Domingo");
                break;
            default:
                System.out. println("Numero no valido"); // sin break     
        }
        return dia;
    }
            
    
}
