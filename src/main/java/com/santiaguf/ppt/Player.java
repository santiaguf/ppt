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
public class Player {
    private final String PLAYER_OPTION_MESSAGE = "-----------------\n"
                    + "Escribe una opción,presiona enter y espera que la pc seleccione otra opción"
                    + " 1. Piedra, 2. Papel o 3.Tijera \n";
    
    Scanner sc = new Scanner(System.in);
    
    public Player(){
    }
    
    /**
     * Ask user for a option (piedra, papel o tijera).<br>
     * <b>pre: </b> current turn and total turns <br>
     * <b>post: </b> the option user selected.
     * @param turn current turn.
     * @param totalTurns total turns.
     * @param ui object of UserInput class to read user input.
     * @return option user selected. 
     * @throws java.lang.Exception 
     */
    protected int getPlayerOption(int turn, int totalTurns, UserInput ui) throws Exception{
        System.out.println("turn "+(++turn)+" of "+totalTurns+"\n"
                    + PLAYER_OPTION_MESSAGE);
        int option = ui.getUserInput(3);
             
        if(option == 3){
            option = 0;
        }   
        return option;
    }
}
