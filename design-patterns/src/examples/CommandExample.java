package examples;

import patterns.command.interfaces.Command;
import patterns.command.main.Calculator;
import patterns.command.main.CalculatorController;
import patterns.command.operations.AddCommand;
import patterns.command.operations.DivideCommand;
import patterns.command.operations.MultiplyCommand;
import patterns.command.operations.SubtractCommand;

public class CommandExample {
    public static void main(String[] args) {
        var controller1 = getMultiplyAndDivideByTwoController();
        controller1.display();

        controller1.clickButtonRight();
        controller1.clickButtonRight();
        controller1.clickButtonLeft();

        controller1.undoClick();
        controller1.undoClick();
        controller1.undoClick();
    }

    static CalculatorController getMultiplyAndDivideByTwoController(){
        int initialCalculatorValue = 1;
        int defaultMultiplicationValue = 2;

        Calculator calculator = new Calculator(initialCalculatorValue);
        Command button1 = new MultiplyCommand(calculator, defaultMultiplicationValue);
        Command button2 = new DivideCommand(calculator, defaultMultiplicationValue);

        return new CalculatorController(calculator, button1, button2);
    }

    static CalculatorController getAddAndSubtractByOneController(){
        int initialCalculatorValue = 0;
        int defaultValue = 1;

        Calculator calculator = new Calculator(initialCalculatorValue);
        Command button1 = new AddCommand(calculator, defaultValue);
        Command button2 = new SubtractCommand(calculator, defaultValue);

        return new CalculatorController(calculator, button1, button2);
    }
}
