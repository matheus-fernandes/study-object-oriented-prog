package patterns.command.operations;

import patterns.command.main.Calculator;
import patterns.command.interfaces.Command;

public class SubtractCommand implements Command {

    private Calculator calculator;
    private int defaultValue;

    public SubtractCommand(Calculator calculator, int defaultValue){
        this.calculator = calculator;
        this.defaultValue = defaultValue;
    }

    @Override
    public void execute() {
        calculator.subtract(defaultValue);
    }

    @Override
    public void undo() {
        calculator.add(defaultValue);
    }
}
