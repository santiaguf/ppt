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
    Scanner sc = new Scanner(System.in);
    
    public Player(){
    }
    
    protected int getPlayerOption(){
        System.out.println("-----------------\n"
                    + "Escribe una opción,presiona enter y espera que la pc seleccione otra opción"
                    + " 1. Piedra, 2. Papel o 3.Tijera \n");
        int option = sc.nextInt();
             
        if(option == 3){
            option = 0;
        }   
        return option;
    }
}