package patterns.state.architecture;


public abstract class Gate implements GateActions{
    protected GateState state;

    public Gate(GateState initialState){
        this.state = initialState;
        this.state.beginWith(this);
        this.display();
    }

    public void handle(GateEvent event) {
        GateState next = state.nextFor(event);
        next.beginWith(this);

        this.state = next;
        this.display();
    }

    protected abstract void display();
}
