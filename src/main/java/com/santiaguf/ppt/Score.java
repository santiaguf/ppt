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
    private final String WIN = "Ganaste el juego";
    private final String DRAW = "Empataste el juego";
    private final String LOSE = "Perdiste el juego";
    public Score(){
    }
    
    /**
     * Show the final result.<br>
     * <b>pre: </b> number with result <br>
     * <b>post: </b> Message with final result.
     * @param matchResult result. matchResult != null
     */
    protected void getFinalResult(int matchResult){
        if(matchResult < 0){ 
            System.out.println(LOSE);
        }else if(matchResult == 0){
            System.out.println(DRAW);
        }else{
            System.out.println(WIN);
        }
    }    
}
