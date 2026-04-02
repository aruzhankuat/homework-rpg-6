package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;

public class BlockHandler extends DefenseHandler {
    @Override
    public void handle(DamageRequest request, ArenaFighter fighter) {
        if (Math.random() < fighter.getBlockChance()) {
            request.amount /= 2;
            System.out.println("[Block] " + fighter.getName() + " blocked half damage! Remaining: " + request.amount);
        }
        if (next != null && request.amount > 0) next.handle(request, fighter);
    }
}