package com.narxoz.rpg.arena;

public class ArenaFighter implements ArenaOpponent {
    private String name;
    private int hp;
    private int attackPower;
    private int armor;
    private double dodgeChance;
    private double blockChance;

    public ArenaFighter(String name, int hp, int attackPower, int armor, double dodgeChance, double blockChance) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.armor = armor;
        this.dodgeChance = dodgeChance;
        this.blockChance = blockChance;
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getAttackPower() { return attackPower; }
    public int getArmor() { return armor; }
    public double getDodgeChance() { return dodgeChance; }
    public double getBlockChance() { return blockChance; }

    @Override
    public void takeDamage(int amount) { this.hp -= amount; }
    @Override
    public void restoreHp(int amount) { this.hp += amount; }
}