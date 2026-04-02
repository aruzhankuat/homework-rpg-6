package com.narxoz.rpg;

import com.narxoz.rpg.arena.ArenaFighter;
import com.narxoz.rpg.arena.TournamentResult;
import com.narxoz.rpg.command.*;
import com.narxoz.rpg.tournament.TournamentEngine;

public class Main {
    public static void main(String[] args) {

        ArenaFighter player = new ArenaFighter("Kratos", 100, 35, 12, 0.2, 0.3);
        ArenaFighter boss = new ArenaFighter("Ares", 250, 55, 20, 0.05, 0.1);

        System.out.println("COMMAND PATTERN DEMO ");
        ActionQueue queue = new ActionQueue();
        queue.enqueue(new AttackCommand(player, boss));
        queue.enqueue(new HealCommand(player));

        System.out.println("Executing Action Queue...");
        queue.executeAll();

        System.out.println("\nTesting Undo...");
        queue.undoLast();

        System.out.println("\nTOURNAMENT & CHAIN OF RESPONSIBILITY DEMO ");
        TournamentEngine engine = new TournamentEngine();
        TournamentResult result = engine.startTournament(player, boss);

        System.out.println();
        result.display();
    }
}