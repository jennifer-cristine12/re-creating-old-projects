package entities.model;

import entities.attributes.Attributes;

public class EnemyModel implements Attributes {
    private int life = 100;
    private int damage = 1;
    private int special = 5;
    private int moves = 10;

    @Override
    public int getLife() {
        return life;
    }

    @Override
    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getSpecial() {
        return special;
    }

    @Override
    public void setSpecial(int special) {
        this.special = special;
    }

    @Override
    public int getMoves() {
        return moves;
    }

    @Override
    public void setMoves(int moves) {
        this.moves = moves;
    }

}
