package com.gdstruc.module1;

import java.util.Objects;

public class Enemy {
    private int id;
    private  String name;
    private int hp;

    public Enemy(int id, String name, int hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enemy enemy = (Enemy) o;
        return id == enemy.id && hp == enemy.hp && Objects.equals(name, enemy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hp);
    }
}
