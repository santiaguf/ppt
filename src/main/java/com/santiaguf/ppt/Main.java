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
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        showMenu(sc);
    }
    
    public static void showMenu(Scanner sc){
        int option = 0;
        do{
            System.out.println("-----------------\n"
                    + " Piedra, Papel o Tijera \n"
                    + "1. Jugar \n"
                    + "0. Salir");
            option = sc.nextInt();
            if(option == 1){
                playGame(sc);
            }
        }while(option != 0);
    }
    
    public static void playGame(Scanner sc){
        System.out.println("-----------------\n"
                    + "Selecciona una opción y espera que la pc escoja otra"
                    + " 1. Piedra, 2. Papel o 3.Tijera \n");
        int option = sc.nextInt();
        getResult(option);
    }
    
    public static void getResult(int userOption){

        if(userOption == 3){
            userOption = 0;
        }

        String validOptions[] = {"Tijera","Piedra","Papel"};
        String matchs[][] = {{"Empate","Pierdes","Ganas"},{"Ganas","Empate","Pierdes"},{"Pierdes","Ganas","Empate"}};
        
        int machineOption = ThreadLocalRandom.current().nextInt(0, 2 + 1);
        
        System.out.println("La Pc seleccionó: "+validOptions[machineOption]);
        System.out.println("!!"+matchs[userOption][machineOption]+"\n");    
    }
}
