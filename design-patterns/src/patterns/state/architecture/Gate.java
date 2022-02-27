package patterns.state.architecture;


public abstract class Gate implements GateActions{
    protected GateState state;

    public Gate(GateState initialState){
        this.state = initialState;
        this.state.configGate(this);
        this.display();
    }

    public void handleEvent(GateEvent event) {
        this.updateToNextState(event);
        this.display();
    }

    private void updateToNextState(GateEvent event){
        GateState next = state.nextFor(event);
        next.configGate(this);
        this.state = next;
    }

    protected abstract void display();
}
