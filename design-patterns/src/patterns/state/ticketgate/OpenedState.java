package patterns.state.ticketgate;

import patterns.state.architecture.Gate;
import patterns.state.architecture.GateEvent;
import patterns.state.architecture.GateState;

public class OpenedState implements GateState {

    @Override
    public void beginWith(Gate gate) {
        gate.toOpen();
    }

    @Override
    public GateState nextFor(GateEvent event) {
        GateState state;

        switch (event){
            case ENTERED:
                state = new ClosedState();
                break;

            default:
                state = this;
        }

        return state;
    }

    @Override
    public String getName() {
        return "opened";
    }
}
