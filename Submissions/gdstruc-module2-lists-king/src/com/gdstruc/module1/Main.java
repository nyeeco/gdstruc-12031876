package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        Enemy imp = new Enemy(1, "Imp", 50);
        Enemy goblin = new Enemy(2, "Goblin", 75);
        Enemy bat = new Enemy(3, "Bat", 40);

        EnemyLinkedList enemyLinkedList = new EnemyLinkedList();

        enemyLinkedList.addToFront(imp);
        enemyLinkedList.addToFront(goblin);
        enemyLinkedList.addToFront(bat);

        //showing each one
        enemyLinkedList.printList();
        //removing the first node and then showing that
        enemyLinkedList.remove();
        enemyLinkedList.printList();
        //counting
        enemyLinkedList.size();
        //telling if it contains bat and imp after removing
        System.out.println(enemyLinkedList.contains(bat));
        System.out.println(enemyLinkedList.contains(imp));
        //finding what index goblin is
        enemyLinkedList.indexOf(goblin);
    }
}
