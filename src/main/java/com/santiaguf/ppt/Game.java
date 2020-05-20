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

    public Game() {
    Scanner sc = new Scanner(System.in);
    int playerOption = getPlayerOption(sc);
    int machineOption = getMachineOption();
    playGame(playerOption, machineOption);
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
    
    private void playGame(int playerOption, int machineOption){
        System.out.println("La Pc seleccionó: "+ this.validOptions[machineOption]);
        System.out.println("!!"+ this.match[playerOption][machineOption]+"\n");     
    }
}
