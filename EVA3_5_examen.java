/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_examen;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA3_5_examen {
    
    static final int PIEDRA = 1;
    static final int PAPEL = 2;
    static final int TIJERA = 3;
    
    static final int EMPATE = 0;
    static final int GANA = 1;
    static final int PIERDE = 2;
    

    public static void main(String[] args) {
        int jugada;
        int resultadoJuga;
        int resu;
        do{
        resu= pedirJugada ("introduce la jugada piedra(1) papel(2) tijera(3) salir(0)");
        jugada = generarJugadaComp();
            System.out.println(jugada);
        resultadoJuga = evaluarPartida(resu, jugada);
            System.out.println(resultadoJuga);
        }while( resu != 0); 
        
        
    }
    
    public static int pedirJugada(String mensaje){
        
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion=captu.nextInt();
        return seleccion;
        
        
    }
            
    public static int generarJugadaComp(){
        
        int jugada;
        double valor = Math.random();
        if(valor >= 0 && valor < 0.3)
            jugada = PIEDRA;//piedra
        else if (valor >=0.3 && valor < 0.6)
            jugada = PAPEL;//papel
        else
            jugada = TIJERA;//tijera
        return jugada;
    }
    
    public static int evaluarPartida(int jugadaUsu,int jugadaComp){
        int resu;
        if(jugadaUsu == PIEDRA && jugadaComp == PIEDRA)
            resu = EMPATE;
        else if(jugadaUsu == PIEDRA && jugadaComp == PAPEL)
            resu = PIERDE;
        else if(jugadaUsu == PIEDRA && jugadaComp == TIJERA)
            resu = GANA;
        else if(jugadaUsu == PAPEL && jugadaComp == PIEDRA)
            resu = GANA;
        else if(jugadaUsu == PAPEL && jugadaComp == PAPEL)
            resu = EMPATE;
        else if(jugadaUsu == PAPEL && jugadaComp == TIJERA)
            resu = PIERDE;
        else if(jugadaUsu == TIJERA && jugadaComp == PIEDRA)
            resu = PIERDE;
        else if(jugadaUsu == TIJERA && jugadaComp == PAPEL)
            resu = GANA;
        else if(jugadaUsu == TIJERA && jugadaComp == TIJERA)
            resu = EMPATE;
        else
            resu = EMPATE;
            return resu;
    }
    
    
    
}
