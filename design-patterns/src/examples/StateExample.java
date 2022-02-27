package examples;

import patterns.state.architecture.Gate;
import patterns.state.architecture.GateEvent;
import patterns.state.ticketgate.TicketGate;

import static patterns.state.architecture.GateEvent.*;

public class StateExample {
    public static void main(String[] args) {
        // gate created
        Gate gate = new TicketGate();

        // person 1
        gate.handle(ENTER_REQUESTED);
        gate.handle(ENTER_REJECTED);

        // person 2
        gate.handle(ENTER_REQUESTED);
        gate.handle(ENTER_ACCEPTED);
        gate.handle(ENTERED);
    }
}
