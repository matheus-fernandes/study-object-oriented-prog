package patterns.state.ticketgate;

import patterns.state.architecture.Gate;

import static java.lang.System.out;

public class TicketGate extends Gate {
    private String light = "";
    private boolean locked = false;

    public TicketGate(){
        super(new ClosedState());
    }

    @Override
    public void toLock() {
        this.light = "red";
        this.locked = true;
    }

    @Override
    public void toWait() {
        this.light = "yellow";
        this.locked = true;
    }

    @Override
    public void toOpen() {
        this.light = "green";
        this.locked = false;
    }

    @Override
    protected void display() {
        out.print("state: " + state.getName());
        out.println();

        out.print("--> light: " + light);
        out.print(", locked: " + locked);
        out.println("\n");
    }
}
