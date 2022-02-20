package patterns.command.main;

import patterns.command.interfaces.Command;
import patterns.command.interfaces.Invoker;

import static java.lang.System.*;

public class CalculatorController extends Invoker {
    private Calculator calculator;
    private Command buttonLeft;
    private Command buttonRight;

    public CalculatorController(Calculator calculator, Command btnLeft, Command btnRight){
        super();
        this.calculator = calculator;
        this.buttonLeft = btnLeft;
        this.buttonRight = btnRight;
    }

    public void clickButtonLeft(){
        execute(buttonLeft);
        display();
    }

    public void clickButtonRight(){
        execute(buttonRight);
        display();
    }

    public void undoClick(){
        undo();
        display();
    }

    public void display(){
        out.println("Current: " + calculator.getCurrent());
    }
}
