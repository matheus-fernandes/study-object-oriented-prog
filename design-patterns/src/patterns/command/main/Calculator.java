package patterns.command.main;

public class Calculator {
    private float current;

    public Calculator(int initial){
        current = initial;
    }

    public void add(float addition){
        current += addition;
    }

    public void subtract(float subtraction){
        current -= subtraction;
    }

    public void multiply(float multiplier){
        current *= multiplier;
    }

    public void divide(float divider){
        current /= divider;
    }

    public float getCurrent() {
        return current;
    }
}
