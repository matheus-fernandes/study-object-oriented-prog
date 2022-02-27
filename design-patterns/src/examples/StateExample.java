package examples;

import patterns.state.architecture.Gate;
import patterns.state.ticketgate.TicketGate;

import static patterns.state.architecture.GateEvent.*;

public class StateExample {
    public static void main(String[] args) {
        // gate created
        Gate gate = new TicketGate();

        // person 1
        gate.handleEvent(ENTER_REQUESTED);
        gate.handleEvent(ENTER_REJECTED);

        // person 2
        gate.handleEvent(ENTER_REQUESTED);
        gate.handleEvent(ENTER_ACCEPTED);
        gate.handleEvent(ENTERED);
    }
}
