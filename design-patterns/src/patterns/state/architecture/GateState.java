package patterns.state.architecture;

public interface GateState {
    void beginWith(Gate gate);
    GateState nextFor(GateEvent event);
    String getName();
}
