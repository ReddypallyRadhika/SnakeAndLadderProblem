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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the player:");
        String player= sc.next();
        int playerposition=0;
        System.out.println("player position:"+playerposition);
        int rolldie = (int) (Math.floor(Math.random()*10)%7);
        //int rolldie =(int) Math.random();
       // System.out.println("player rolldie:"+rolldie);
        int randomOption =(int) (Math.floor(Math.random()*10)%4);
       // int randomOption =(int) (Math.random()*1)%3;
        System.out.println(randomOption);
        if(randomOption ==1)
        {
        	 System.out.println("Ladder");
        	 playerposition=rolldie+playerposition;
        	 System.out.println("player position:"+playerposition);
        }
        else if(randomOption ==2)
            {
            	 System.out.println("Snake");
            	 playerposition=playerposition-rolldie;
            	 System.out.println("player position:"+playerposition);
            }
        else
        {
        	System.out.println("No Play");
        	 System.out.println("player position:"+playerposition);
	}

}
}