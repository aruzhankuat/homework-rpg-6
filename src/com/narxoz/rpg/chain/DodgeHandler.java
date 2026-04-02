package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;

public class DodgeHandler extends DefenseHandler {
    @Override
    public void handle(DamageRequest request, ArenaFighter fighter) {
        if (Math.random() < fighter.getDodgeChance()) {
            System.out.println("[Dodge] " + fighter.getName() + " completely evaded the attack!");
            request.amount = 0;
        } else if (next != null) {
            next.handle(request, fighter);
        }
    }
}