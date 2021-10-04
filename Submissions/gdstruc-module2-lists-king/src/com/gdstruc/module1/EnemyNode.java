package com.gdstruc.module1;

public class EnemyNode {
    private Enemy enemy;
    private EnemyNode nextEnemy;

    public EnemyNode(Enemy enemy){
        this.enemy= enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public EnemyNode getNextEnemy() {
        return nextEnemy;
    }

    public void setNextEnemy(EnemyNode nextEnemy) {
        this.nextEnemy = nextEnemy;
    }
}
