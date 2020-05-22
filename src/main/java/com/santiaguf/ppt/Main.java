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
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu(sc);
    }

    /**
     * Execute Main menu. <br>
     * <b>pre:</b> nothing.< br>
     * <b>post:</b> ask for number of turns o exit the program.
     * @param sc object of Scanner class to read user input.
     */
    public static void Menu(Scanner sc){
        int option = 0;
        do{
            showMainMenu();
            option = sc.nextInt();
            if(option == 1){
                showgamesMenu();
                int turns = sc.nextInt();
                Game game = new Game(turns);
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