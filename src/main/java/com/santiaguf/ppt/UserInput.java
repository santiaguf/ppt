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
public class UserInput {
    Scanner sc = new Scanner(System.in);
    private final String INVALID_OPTION = "Opción inválida.";
    private final String ONLY_NUMBERS = "Sólo opciones numéricas.";
    
    public UserInput(){
    }
    
    /**
     * Validate user input to avoid program crash.<b>pre:</b> a maximum number on choice.< br>
    <b>post:</b> give the option user write.
     * @param max max number of choice.
     * @return option user write.
     * @throws java.lang.Exception
     */
    protected int getUserInput(int max) throws Exception{       
        int option;
            try {
                String inputOption = sc.nextLine();
                option = Integer.parseInt(inputOption);
                if(option < 0 || option > max){
                    System.out.println(INVALID_OPTION);
                    option = getUserInput(max);
                }
            } catch (NumberFormatException e) {
                System.out.println(ONLY_NUMBERS);
                option = getUserInput(max);
            }    
        return option;
    }
}
