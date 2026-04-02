package com.narxoz.rpg.command;
import com.narxoz.rpg.arena.ArenaFighter;

public class AttackCommand implements ActionCommand {
    private ArenaFighter attacker;
    private ArenaFighter target;
    private int damage;

    public AttackCommand(ArenaFighter attacker, ArenaFighter target) {
        this.attacker = attacker;
        this.target = target;
        this.damage = attacker.getAttackPower();
    }

    @Override
    public void execute() {
        System.out.println(attacker.getName() + " attacks " + target.getName() + " for " + damage + " DMG.");
        target.takeDamage(damage);
    }

    @Override
    public void undo() {
        target.restoreHp(damage);
        System.out.println("Undo: " + target.getName() + " restored " + damage + " HP.");
    }
}