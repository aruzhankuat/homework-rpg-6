package com.narxoz.rpg.command;
import java.util.*;

public class ActionQueue {
    private Queue<ActionCommand> queue = new LinkedList<>();
    private Stack<ActionCommand> history = new Stack<>();

    public void enqueue(ActionCommand cmd) { queue.add(cmd); }

    public void executeAll() {
        while (!queue.isEmpty()) {
            ActionCommand cmd = queue.poll();
            cmd.execute();
            history.push(cmd);
        }
    }

    public void undoLast() {
        if (!history.isEmpty()) history.pop().undo();
    }
}