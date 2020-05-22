/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiaguf.ppt;

import java.util.Scanner;

/**
 *
 * @author santiago
 */
public class Game { 
    private final String validOptions[] = {"Tijera","Piedra","Papel"};
    private final int match[][] = {{0,2,1},{1,0,2},{2,1,0}};
    private final String results[] = {"Empate","ganas","Pierdes"};
    private int matchResult = 0;
    Scanner sc = new Scanner(System.in);
    Machine machine = new Machine();
    
    public Game(int games) {
        playGame(games);
    }
    
    private void playGame(int games){     
        for (int i = 0; i < games; i++) {
            int playerOption = getPlayerOption(sc);
            int machineOption = machine.getMachineOption();
            this.matchResult += getMatch(playerOption, machineOption);
        }
        getFinalResult(this.matchResult);   
    }
    
    private static int getPlayerOption(Scanner sc){
        System.out.println("-----------------\n"
                    + "Escribe una opción,presiona enter y espera que la pc seleccione otra opción"
                    + " 1. Piedra, 2. Papel o 3.Tijera \n");
        int option = sc.nextInt();
             
        if(option == 3){
            option = 0;
        }   
        return option;
    }
    
  
    
    private int getMatch(int playerOption, int machineOption){
        
        System.out.println("La Pc seleccionó: "+ this.validOptions[machineOption]);
        System.out.println("!!"+ this.results[this.match[playerOption][machineOption]]+"\n");
        
        int result = this.match[playerOption][machineOption];
        if(result == 2){
            result = -1;
        }
        
        return result;
    }
    
    private void getFinalResult(int matchResult){
        if(matchResult < 0){
            System.out.println("Perdiste el juego");
        }else if(matchResult == 0){
            System.out.println("Empataste el juego");
        }else{
            System.out.println("Ganaste el juego");
        }
    }
}
