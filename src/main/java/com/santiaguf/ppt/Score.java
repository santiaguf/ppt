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
public class Score {
    public Score(){
    }
    
    protected void getFinalResult(int matchResult){
        if(matchResult < 0){
            System.out.println("Perdiste el juego");
        }else if(matchResult == 0){
            System.out.println("Empataste el juego");
        }else{
            System.out.println("Ganaste el juego");
        }
    }    
}
