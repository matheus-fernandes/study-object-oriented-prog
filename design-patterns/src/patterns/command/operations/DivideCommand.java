package patterns.command.operations;

import patterns.command.main.Calculator;
import patterns.command.interfaces.Command;

public class DivideCommand implements Command {

    private Calculator calculator;
    private int defaultValue;

    public DivideCommand(Calculator calculator, int defaultValue){
        this.calculator = calculator;
        this.defaultValue = defaultValue;
    }

    @Override
    public void execute() {
        calculator.divide(defaultValue);
    }

    @Override
    public void undo() {
        calculator.multiply(defaultValue);
    }
}
