/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiaguf.ppt;


/**
 *
 * @author santiago
 */
public class Main {
    public static void main(String[] args) throws Exception{
        UserInput userInput = new UserInput();
        Menu(userInput);
    }

    /**
     * Execute Main menu.<br>
     * <b>pre:</b> nothing.< br>
     * <b>post:</b> ask for number of turns o exit the program.
     * @param ui object of UserInput class to read user input.
     * @throws java.lang.Exception
     */
    public static void Menu(UserInput ui) throws Exception{
        int option;
        do{
            showMainMenu();
            option = ui.getUserInput(1);
            if(option == 1){
                showgamesMenu();
                int turns = ui.getUserInput(20);
                Game game = new Game(turns, ui);
            }
        }while(option != 0);
    }
    
    /**
     * Show Main Menu text.
     */
    public static void showMainMenu(){
        System.out.println("-----------------\n"
            + " Piedra, Papel o Tijera (escribe una opción y presiona enter) \n"
            + "1. Jugar \n"
            + "0. Salir");
    }
    
    /**
     * Show Games Menu text.
     */
    public static void showgamesMenu(){
        System.out.println("-----------------\n"
        + " escribe un número de partidas (se recomienda 5) \n");    
    } 
}