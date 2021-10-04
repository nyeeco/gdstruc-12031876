package com.gdstruc.module1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public int size()
    {
        int count = 0;
        ListIterator<Card> iterator = stack.listIterator();
        while (iterator.hasNext())
        {
            count++;
            iterator.next();
        }
        return count;
    }
}
