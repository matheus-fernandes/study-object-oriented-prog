package patterns.command.operations;

import patterns.command.main.Calculator;
import patterns.command.interfaces.Command;

import static java.lang.System.*;

public class AddCommand implements Command {

    private Calculator calculator;
    private int defaultValue;

    public AddCommand(Calculator calculator, int defaultValue){
        this.calculator = calculator;
        this.defaultValue = defaultValue;
    }

    @Override
    public void execute() {
        calculator.add(defaultValue);
    }

    @Override
    public void undo() {
        calculator.subtract(defaultValue);
    }
}
