package ru.pczver.pattern.state;

import ru.pczver.pattern.state.context.TransformerContext;
import ru.pczver.pattern.state.state.FireState;
import ru.pczver.pattern.state.state.MoveState;
import ru.pczver.pattern.state.state.TransformerState;

public class Start {

    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setTransformerState(stateFire);
        context.action();

        context.setTransformerState(stateMove);
        context.action();
    }
}
