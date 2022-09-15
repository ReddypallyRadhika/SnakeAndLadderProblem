/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class SnakeAndLadder {

	/**
	 * @param args
	 */
	/*
	 * UC1
	 * Snake and Ladder game played with single player at start position 0
	 */
	/*UC2
	 * The Player rolls the die to get a number between 1 to 6.
	 * - Use ((RANDOM)) to get the number between 1 to 6
	 */
	/*UC3
	 * The Player then checks for a Option. They are No Play, Ladder or Snake.
	 */
	/*UC4
	 * Repeat till the Player reaches the winning position 100. 
	 * - Note In case the player position moves below 0,
	 *  then the player restarts from 0
	 * 
	 */
	/*
	 * UC5
	 * Ensure the player gets to exact winning position 100.
	 *  - Note in case the player position go above 100, 
	 *  the player stays in the same previous position till the player gets the exact number that adds to 100
	 */
	/*
	 * UC6
	 * Report the number of times the dice was played to win the game and also the position after every die role
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the player:");
        String player= sc.next();
        int playerposition=0;
        int playernewposition = 0;
        int winningposition = 100;
        int count= 0;
        System.out.println("player position:"+playerposition);
        int rolldie = (int) (Math.floor(Math.random()*10)%7);
        while(playernewposition<1 || playernewposition!=winningposition)
       {
        	
    	  System.out.println("restart game");
        for(playerposition=0;playerposition<=100;playerposition=rolldie+playernewposition)
        {
        	
        	
        	int randomOption =(int) (Math.floor(Math.random()*10)%4);
        
        	System.out.println(randomOption);
        if(randomOption ==1)
        {
        	 System.out.println("Ladder");
        	 playernewposition=rolldie+playernewposition;
        	 System.out.println("player position:"+playernewposition);
        }
        else if(randomOption ==2)
            {
            	 System.out.println("Snake");
            	 playernewposition=playernewposition-rolldie;
            	 System.out.println("player position:"+playernewposition);
            }
       else
        {
        	System.out.println("No Play");
        	 System.out.println("player position:"+playernewposition);
	     }
        
        
       
        
        if(playernewposition>=winningposition)
    	{
        	System.out.println("player position:"+playernewposition);
        	System.out.println("Stop");
        }
        ++count;
	    
	  
        }
    
		  
     }
        System.out.println("Total Number Of Times Die Rolled: " + count);
      
	}   
	

}