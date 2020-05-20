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
        showMenu(sc);
    }
    
    public static void showMenu(Scanner sc){
        int option = 0;
        do{
            System.out.println("-----------------\n"
                    + " Piedra, Papel o Tijera (escribe una opción y presiona enter) \n"
                    + "1. Jugar \n"
                    + "0. Salir");
            option = sc.nextInt();
            if(option == 1){
                Game game = new Game();
            }
        }while(option != 0);
    }
     
}