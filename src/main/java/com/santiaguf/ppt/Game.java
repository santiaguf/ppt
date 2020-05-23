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
public class Game { 
    private final String validOptions[] = {"Tijera","Piedra","Papel"};
    private final int match[][] = {{0,2,1},{1,0,2},{2,1,0}};
    private final String results[] = {"Empate","ganas","Pierdes"};
    private int matchResult = 0;
    private final String MACHINE_OPTION = "La Pc seleccionó: ";
    
    Machine machine = new Machine();
    Player player = new Player();
    Score score = new Score();
    
    public Game(int turns, UserInput ui) {
        playGame(turns, ui);
    }
    
    /**
     * Create a Game with turns and show final result. <br>
     * <b>pre: </b> the number of turns. turns>0 && turns != null. <br>
     * <b>post: </b> turns for the game.
     * @param turns number of turns in the game.
     * @param ui object of UserInput class to read user input.
     */
    private void playGame(int turns, UserInput ui){     
        for (int i = 0; i < turns; i++) {
            int playerOption = player.getPlayerOption(i,turns, ui);
            int machineOption = machine.getMachineOption();
            this.matchResult += getMatch(playerOption, machineOption);
        }
        score.getFinalResult(this.matchResult);   
    }
    
    /**
     * Get the result of a Match (turn). <br>
     * <b>pre: </b> Player and machine Options . <br>
     * <b>post: </b> the option machine selected. 
     * @param playerOption the option user selected. playerOption>0 && playerOption != null.
     * @param machineOption the option machine selected. machineOption>0 && machineOption != null.
     * @return result of the match (turn). 
     */
    private int getMatch(int playerOption, int machineOption){
        
        System.out.println(MACHINE_OPTION + this.validOptions[machineOption]);
        System.out.println("!!"+ this.results[this.match[playerOption][machineOption]]+"\n");
        
        int result = this.match[playerOption][machineOption];
        if(result == 2){
            result = -1;
        }
        
        return result;
    }
    
}
