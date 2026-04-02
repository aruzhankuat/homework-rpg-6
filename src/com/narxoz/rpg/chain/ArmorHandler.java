package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;

public class ArmorHandler extends DefenseHandler {
    @Override
    public void handle(DamageRequest request, ArenaFighter fighter) {
        request.amount = Math.max(0, request.amount - fighter.getArmor());
        System.out.println("[Armor] Armor reduced damage to: " + request.amount);
        if (next != null && request.amount > 0) next.handle(request, fighter);
    }
}