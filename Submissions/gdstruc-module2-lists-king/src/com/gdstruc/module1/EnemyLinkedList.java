package com.gdstruc.module1;

public class EnemyLinkedList {
    private EnemyNode head;

    public void  addToFront(Enemy enemy)
    {
        EnemyNode enemyNode = new EnemyNode(enemy);
        enemyNode.setNextEnemy(head);
        head = enemyNode;
    }

    public void printList()
    {
        EnemyNode current = head;
        System.out.print("HEAD ->");
        while (current != null)
        {
            System.out.print(current.getEnemy());
            System.out.print(" -> ");
            current = current.getNextEnemy();
        }
        System.out.println("null");
    }
    public void remove()
    {
        EnemyNode current = head;
        current = current.getNextEnemy();
        head = null;
        head = current;

    }

    public void size()
    {
        int count = 0;
        EnemyNode current = head;
        while (current != null)
        {
            count++;
            current = current.getNextEnemy();
        }
        System.out.println("Size is: " + count);
    }

    public boolean contains(Enemy enemy)
    {
        EnemyNode current = head;
        while (current != null)
        {
            if(enemy == current.getEnemy())
            {
                return true;
            }
            current = current.getNextEnemy();
        }
        return false;
    }

    public void indexOf(Enemy enemy)
    {
        int index = 0;
        EnemyNode current = head;
        while (current != null)
        {
            if(enemy == current.getEnemy())
             {
                 System.out.println("Index is: " + index);
                 break;
             }
            index++;
            current = current.getNextEnemy();
        }
    }
}
