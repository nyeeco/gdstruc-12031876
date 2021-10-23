package com.gdstruc.module1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            ArrayQueue queue = new ArrayQueue(7);
            // randomizing how many players will queue for matchmaking
            int min = 1;
            int max = 7;
            int rounds = 0;

            // ?? 10 rounds
            while (rounds != 10)
            {
                int random = (int)(Math.random() * (max-min+1)+min);
                //Printing out the random 5-7 players before the game starts
                System.out.println("Players queued: ");
                for (int j = 1; j <= random; j++)
                {
                    queue.add(new Player ("Player " + j));
                }
                queue.printQueue();

                cont();
                //if it's not enough
                while (queue.size() >= 5)
                {
                    // removing first 5 players
                    System.out.println("Starting game! Removing first 5 Players.");
                    // for loop counting to 5, pop each time
                    for (int j = 0; j < 5; j++)
                    {
                        queue.remove();
                    }
                    System.out.println("Players remaining: ");
                    queue.printQueue();
                    rounds++;
                }

            }
            }
    }
    static public void cont()
    {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
