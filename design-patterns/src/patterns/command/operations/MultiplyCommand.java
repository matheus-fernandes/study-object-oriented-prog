package patterns.command.operations;

import patterns.command.main.Calculator;
import patterns.command.interfaces.Command;

public class MultiplyCommand implements Command {

    private Calculator calculator;
    private int defaultValue;

    public MultiplyCommand(Calculator calculator, int defaultValue){
        this.calculator = calculator;
        this.defaultValue = defaultValue;
    }

    @Override
    public void execute() {
        calculator.multiply(defaultValue);
    }

    @Override
    public void undo() {
        calculator.divide(defaultValue);
    }
}
