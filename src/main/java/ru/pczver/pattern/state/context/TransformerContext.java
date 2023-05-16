package ru.pczver.pattern.state.context;

import ru.pczver.pattern.state.state.TransformerState;

public class TransformerContext implements TransformerState {

    private TransformerState transformerState;

    public TransformerState getTransformerState() {
        return transformerState;
    }

    public void setTransformerState(TransformerState transformerState) {
        this.transformerState = transformerState;
    }
    @Override
    public void action() {
        this.transformerState.action();
    }
}
