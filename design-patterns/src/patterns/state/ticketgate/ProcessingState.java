package patterns.state.ticketgate;

import patterns.state.architecture.Gate;
import patterns.state.architecture.GateEvent;
import patterns.state.architecture.GateState;

public class ProcessingState implements GateState {
    @Override
    public void configGate(Gate gate) {
        gate.toWait();
    }

    @Override
    public GateState nextFor(GateEvent event) {
        GateState state;

        switch (event){
            case ENTER_ACCEPTED:
                state = new OpenedState();
                break;

            case ENTER_REJECTED:
                state = new ClosedState();
                break;

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
        return "processing";
    }
}
