package patterns.command.interfaces;

import java.util.Stack;

public abstract class Invoker {
    protected Stack<Command> commands;

    public Invoker(){
        commands = new Stack<>();
    }

    protected void execute(Command command){
        command.execute();
        commands.push(command);
    }

    protected void undo(){
        commands.pop().undo();
    }
}
