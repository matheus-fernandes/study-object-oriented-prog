package examples;

import patterns.adapter.Writer;
import patterns.adapter.WriterAdapterFromPrintStream;

public class AdapterExample {
    public static void main(String[] args) {
        Writer writer = new WriterAdapterFromPrintStream(System.out);

        writer.say("Hello World!");
        writer.say("I am an Adapter!");
    }
}
