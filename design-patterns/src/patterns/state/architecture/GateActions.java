package patterns.state.architecture;

public interface GateActions {
    void toLock();
    void toWait();
    void toOpen();
}
