package ru.pczver.pattern.state.state;

public class MoveState implements TransformerState {
    @Override
    public void action() {
        System.out.println("move");
    }
}
