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

	/*
	 * UC7 Play the game with 2 Player. In this case if a Player gets a Ladder then
	 * plays again. Finally report which Player won the game
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the player1:");
		String player1 = sc.next();
		System.out.println("Enter the name of the player2:");
		String player2 = sc.next();
		int playerposition = 0;
		int playernewposition = 0;
		int winningposition = 100;
		int count = 0;

		System.out.println("player position:" + playerposition);
		int rolldie = (int) (Math.floor(Math.random() * 10) % 7);
		if (playerposition == 0 || playernewposition == 0) {
			switch (rolldie) {
			case 1:
				while (playernewposition < 1 || playernewposition != winningposition) {

					System.out.println("restart game");
					for (playerposition = 0; playerposition <= 100; playerposition = rolldie + playernewposition) {

						int randomOption = (int) (Math.floor(Math.random() * 10) % 4);

						System.out.println(randomOption);
						if (randomOption == 1) {
							System.out.println("Ladder");
							playernewposition = rolldie + playernewposition;
							System.out.println("player position:" + playernewposition);
						} else if (randomOption == 2) {
							System.out.println("Snake");
							playernewposition = playernewposition - rolldie;
							System.out.println("player position:" + playernewposition);
						} else {
							System.out.println("No Play");
							System.out.println("player position:" + playernewposition);
						}

						if (playernewposition >= winningposition) {
							System.out.println("player position:" + playernewposition);
							System.out.println("Stop");
						}
						++count;

					}

					if (playernewposition == winningposition) {
						System.out.println("player1 won the game");
					}

				}
				System.out.println("Total Number Of Times Die Rolled: " + count);

				break;
			case 2:

				while (playernewposition < 1 || playernewposition != winningposition) {

					System.out.println("restart game");
					for (playerposition = 0; playerposition <= 100; playerposition = rolldie + playernewposition) {

						int randomOption = (int) (Math.floor(Math.random() * 10) % 4);

						System.out.println(randomOption);
						if (randomOption == 1) {
							System.out.println("Ladder");
							playernewposition = rolldie + playernewposition;
							System.out.println("player position:" + playernewposition);
						} else if (randomOption == 2) {
							System.out.println("Snake");
							playernewposition = playernewposition - rolldie;
							System.out.println("player position:" + playernewposition);
						} else {
							System.out.println("No Play");
							System.out.println("player position:" + playernewposition);
						}

						if (playernewposition >= winningposition) {
							System.out.println("player position:" + playernewposition);
							System.out.println("Stop");
						}
						++count;

					}

					if (playernewposition == winningposition) {
						System.out.println("player2 won the game");
					}

				}
				System.out.println("Total Number Of Times Die Rolled: " + count);

			}
		}
	}

}