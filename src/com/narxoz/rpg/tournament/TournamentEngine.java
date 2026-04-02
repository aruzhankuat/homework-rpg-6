package com.narxoz.rpg.tournament;
import com.narxoz.rpg.arena.*;
import com.narxoz.rpg.chain.*;
import com.narxoz.rpg.command.*;

public class TournamentEngine {
    public TournamentResult startTournament(ArenaFighter p1, ArenaFighter p2) {
        System.out.println("Tournament Started: " + p1.getName() + " vs " + p2.getName());

        DefenseHandler chain = new DodgeHandler();
        DefenseHandler block = new BlockHandler();
        DefenseHandler armor = new ArmorHandler();
        DefenseHandler hp = new HpHandler();
        chain.setNext(block);
        block.setNext(armor);
        armor.setNext(hp);

        ActionQueue actions = new ActionQueue();
        actions.enqueue(new AttackCommand(p1, p2));
        actions.executeAll();

        System.out.println("\n Defense Chain Test (Enemy Counter-Attack) ");
        chain.handle(new DamageRequest(45), p1);

        return new TournamentResult(p1.getHp() > 0 ? p1.getName() : p2.getName(), 1);
    }
}