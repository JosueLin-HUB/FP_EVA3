/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_matriz;

/**
 *
 * @author elfor
 */
public class EVA3_6_matriz {

    public static void main(String[] args) {
        int[] Valores = new int [5];//arreglo de una dimension
        //arreglo de dos dimenciones--> matriz   hoja de exel
        int [][] matriz = new int [3][3];
        matriz [0][0] = 100;
        matriz [0][1] = 200;
        matriz [0][2] = 300;
        matriz [1][0] = 400;
        matriz [1][1] = 500;
        matriz [1][2] = 600;
        matriz [2][0] = 700;
        matriz [2][1] = 800;
        matriz [2][2] = 900;
        //imprimir
        for (int i = 0; i < 3; i++) {//Primer dimension
            for (int j = 0; j < 3; j++) {//Segunda dimencion
                System.out.print("["+matriz[i][j]+"]");
            }System.out.println("");
        }
        
        
        
    }
}
