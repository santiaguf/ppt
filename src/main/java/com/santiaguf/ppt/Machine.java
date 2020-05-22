/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiaguf.ppt;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author santiago
 */
public class Machine {
    
    public Machine(){
    }
    
    /**
     * generate random option by machine.  <br>
     * <b>pre: </b> nothing. <br>
     * <b>post: </b> the option machine selected. 
     * @return the option machine selected.
     */
    protected int getMachineOption(){
        return ThreadLocalRandom.current().nextInt(0, 2 + 1);
    }  
}
