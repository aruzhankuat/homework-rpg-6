package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;

public abstract class DefenseHandler {
    protected DefenseHandler next;
    public void setNext(DefenseHandler next) { this.next = next; }
    public abstract void handle(DamageRequest request, ArenaFighter fighter);
}