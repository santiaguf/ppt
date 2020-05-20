/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiaguf.ppt;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author santiago
 */
public class Game { 
    private final String validOptions[] = {"Tijera","Piedra","Papel"};
    private final String match[][] = {{"Empate","Pierdes","Ganas"},{"Ganas","Empate","Pierdes"},{"Pierdes","Ganas","Empate"}};
    private int matchResult = 0;
    Scanner sc = new Scanner(System.in);
    
    public Game(int games) {
        playGame(games);
    }
    
    private void playGame(int games){
        
        for (int i = 0; i < games; i++) {
            int playerOption = getPlayerOption(sc);
            int machineOption = getMachineOption();
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
    
    private static int getMachineOption(){
        return ThreadLocalRandom.current().nextInt(0, 2 + 1);
    }    
    
    private int getMatch(int playerOption, int machineOption){
        System.out.println("La Pc seleccionó: "+ this.validOptions[machineOption]);
        System.out.println("!!"+ this.match[playerOption][machineOption]+"\n");
        
        switch (this.match[playerOption][machineOption]) {
            case "Ganas":
                return 1;
            case "Pierdes":
                return -1;
            case "Empate":
            default:
                return 0;
        }
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
