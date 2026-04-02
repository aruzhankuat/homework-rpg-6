package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;

public class HpHandler extends DefenseHandler {
    @Override
    public void handle(DamageRequest request, ArenaFighter fighter) {
        fighter.takeDamage(request.amount);
        System.out.println(" [HP] " + fighter.getName() + " took " + request.amount + " damage. Current HP: " + fighter.getHp());
    }
}