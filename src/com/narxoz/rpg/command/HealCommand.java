package com.narxoz.rpg.command;
import com.narxoz.rpg.arena.ArenaFighter;

public class HealCommand implements ActionCommand {
    private ArenaFighter fighter;
    private int amount = 25;

    public HealCommand(ArenaFighter fighter) { this.fighter = fighter; }

    @Override
    public void execute() {
        fighter.restoreHp(amount);
        System.out.println(fighter.getName() + " casted Heal for " + amount + " HP.");
    }

    @Override
    public void undo() {
        fighter.takeDamage(amount);
        System.out.println("Undo: " + fighter.getName() + " lost the healed HP.");
    }
}