package com.narxoz.rpg.command;
import com.narxoz.rpg.arena.ArenaFighter;

public class DefendCommand implements ActionCommand {
    private ArenaFighter fighter;
    public DefendCommand(ArenaFighter fighter) { this.fighter = fighter; }

    @Override
    public void execute() { System.out.println(fighter.getName() + " entered Defensive Stance."); }
    @Override
    public void undo() { System.out.println("Undo: Defensive Stance removed for " + fighter.getName()); }
}