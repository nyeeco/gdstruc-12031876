package com.gdstruc.module1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        CardStack stack = new CardStack();
        Player playerStack = new Player();
        DiscardedCardStack discardStack = new DiscardedCardStack();

        //card names
        stack.push(new Card(1,"Kris"));
        stack.push(new Card(2,"Susie"));
        stack.push(new Card(3,"Ralsei"));
        stack.push(new Card(4,"Noelle"));
        stack.push(new Card(5,"Berdly"));
        stack.push(new Card(6,"Queen"));
        stack.push(new Card(7,"King"));
        stack.push(new Card(8,"Lancer"));
        stack.push(new Card(9,"Rouxls Kaard"));
        stack.push(new Card(10,"Pipis"));
        stack.push(new Card(11,"Pipis"));
        stack.push(new Card(12,"Poppup"));
        stack.push(new Card(13,"Poppup"));
        stack.push(new Card(14,"Virovirokun"));
        stack.push(new Card(15,"Mauswheel"));
        stack.push(new Card(16,"Maus"));
        stack.push(new Card(17,"Ambyu-lance"));
        stack.push(new Card(18,"Rabbick"));
        stack.push(new Card(19,"Rudinn"));
        stack.push(new Card(20,"Rudinn"));
        stack.push(new Card(21,"Tasque Manager"));
        stack.push(new Card(22,"Tasque"));
        stack.push(new Card(23,"Jigsawry"));
        stack.push(new Card(24,"Hathy"));
        stack.push(new Card(25,"Hathy"));
        stack.push(new Card(26,"King Round"));
        stack.push(new Card(27,"Werewerewire"));
        stack.push(new Card(28,"Werewire"));
        stack.push(new Card(29,"Jevil"));
        stack.push(new Card(30,"Spamton"));

        //while CardStack is not empty
        while (stack.size() != 0)
        {
            //randomizer here
            int min = 1;
            int max = 3;
            int minCards = 1;
            int maxCards =5;
            int random = (int)(Math.random() * (max-min+1)+min);
            int randomCards = (int)(Math.random() * (maxCards-minCards+1)+minCards);

            //draw card from CardStack to Player
            if(random == 1)
            {
                //if random cards are more than the card stack has
                if(stack.size() < randomCards)
                {
                    randomCards = stack.size();
                }
                for (int i = 0; i < randomCards; i++)
                {
                    playerStack.push(stack.pop());
                }
                System.out.println("Withdrawing "+  randomCards + " cards from the Card Stack!");
            }
            //discard card from Player to DiscardedCardStack
            else if (random == 2)
            {
                // if the player has no cards
                if (playerStack.size() == 0)
                {
                    System.out.println("No cards left to draw!");
                    randomCards = 0;
                }
                // if random cards are more than the player has
                else if (playerStack.size() < randomCards)
                {
                    randomCards = playerStack.size();
                }
                for (int i = 0; i < randomCards; i++)
                {
                    discardStack.push(playerStack.pop());
                }
                System.out.println("Discarding "+  randomCards + " cards from the Card Stack!");
            }
            //draw card from DiscardedCardStack to Player
            else
            {
                // if the discarded has no cards
                if (discardStack.size() == 0)
                {
                    System.out.println("No cards left to draw!");
                    randomCards = 0;
                }
                // if random cards are more than the discarded pile has
                else if (discardStack.size() < randomCards)
                {
                    randomCards = discardStack.size();
                }
                for (int i = 0; i < randomCards; i++)
                {
                    playerStack.push(discardStack.pop());
                }
                System.out.println("Withdrawing "+  randomCards + " cards from the Discarded Stack!");
            }
            // how many are in the CardStack
            System.out.println("Number of leftover cards: "+  stack.size());
            // how many are in the discard pile
            System.out.println("Number of discarded cards: "+  discardStack.size());
            // printing out player cards
            System.out.println("Player cards: ");
            playerStack.printStack(); // should be for what cards player has
            //press to continue
            cont();
        }


    }
    static public void cont()
    {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

