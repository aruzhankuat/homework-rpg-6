package com.narxoz.rpg.arena;

public class TournamentResult {
    private String winnerName;
    private int rounds;

    public TournamentResult(String winnerName, int rounds) {
        this.winnerName = winnerName;
        this.rounds = rounds;
    }

    public void display() {
        System.out.println(" Tournament Over ");
        System.out.println("Winner: " + winnerName + " in " + rounds + " rounds.");
    }
}