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
    
    public static void Menu(Scanner sc){
        int option = 0;
        do{
            showMainMenu();
            option = sc.nextInt();
            if(option == 1){
                showgamesMenu();
                int games = sc.nextInt();
                Game game = new Game(games);
            }
        }while(option != 0);
    }
    
    public static void showMainMenu(){
        System.out.println("-----------------\n"
            + " Piedra, Papel o Tijera (escribe una opción y presiona enter) \n"
            + "1. Jugar \n"
            + "0. Salir");
    }
    
    public static void showgamesMenu(){
        System.out.println("-----------------\n"
        + " escribe un número de partidas (se recomienda 5) \n");    
    } 
}