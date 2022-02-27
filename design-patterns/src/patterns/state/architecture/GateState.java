package patterns.state.architecture;

public interface GateState {
    void configGate(Gate gate);
    GateState nextFor(GateEvent event);
    String getName();
}
