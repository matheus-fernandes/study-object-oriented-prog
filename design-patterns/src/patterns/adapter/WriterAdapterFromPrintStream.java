package patterns.adapter;

import java.io.PrintStream;

public class WriterAdapterFromPrintStream implements Writer{
    private PrintStream printer;

    public WriterAdapterFromPrintStream(PrintStream printer){
        this.printer = printer;
    }

    @Override
    public void say(String message) {
        printer.println(message);
    }
}
