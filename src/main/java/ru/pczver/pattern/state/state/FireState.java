package ru.pczver.pattern.state.state;

public class FireState implements TransformerState {
    @Override
    public void action() {
        System.out.println("fire");
    }
}
