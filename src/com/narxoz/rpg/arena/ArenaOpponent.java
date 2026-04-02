package com.narxoz.rpg.arena;

public interface ArenaOpponent {
    void takeDamage(int amount);
    void restoreHp(int amount);
    String getName();
}