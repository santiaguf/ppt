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
        showMenu();
    }
    
    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do{
            System.out.println("-----------------\n"
                    + " Piedra, Papel o Tijera \n"
                    + "1. Jugar \n"
                    + "0. Salir");
            opcion = sc.nextInt();        
        }while(opcion != 0);
    }
}
