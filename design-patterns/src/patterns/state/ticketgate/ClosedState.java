package patterns.state.ticketgate;

import patterns.state.architecture.Gate;
import patterns.state.architecture.GateEvent;
import patterns.state.architecture.GateState;


public class ClosedState implements GateState {

    @Override
    public void beginWith(Gate gate) {
        gate.toLock();
    }

    @Override
    public GateState nextFor(GateEvent event) {
        GateState state;

        switch (event){
            case ENTER_REQUESTED:
                state = new ProcessingState();
                break;

            case ENTER_ACCEPTED:
                state = new OpenedState();
                break;

            default:
                state = this;
        }

        return state;
    }

    @Override
    public String getName() {
        return "closed";
    }
}
