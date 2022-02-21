package examples;

import patterns.proxy.BookProcessor;
import patterns.proxy.BookProcessorProxy;

import static java.lang.System.*;

public class VirtualProxyExample {
    public static void main(String[] args) {
        BookProcessor bookProcessor = new BookProcessorProxy(getContent());

        Integer startingWithA = bookProcessor.getQuantityOfWordsStartingWith('A');
        Integer startingWithD = bookProcessor.getQuantityOfWordsStartingWith('D');

        Integer endingWithA = bookProcessor.getQuantityOfWordsEndingWith('A');
        Integer endingWithD = bookProcessor.getQuantityOfWordsEndingWith('D');

        printStaringOccurrences('A', startingWithA);
        printStaringOccurrences('D', startingWithD);

        printEndingOccurrences('A', endingWithA);
        printEndingOccurrences('D', endingWithD);
    }

    static String getContent(){
        return """
               Here's to the crazy ones. The misfits. The rebels. 
               The troublemakers. The round pegs in the square holes. 
               The ones who see things differently. 
               They're not fond of rules. 
               And they have no respect for the status quo. 
               You can quote them, disagree with them, glorify or vilify them. 
               About the only thing you can't do is ignore them. 
               Because they change things. 
               They push the human race forward. 
               And while some may see them as the crazy ones, we see genius. 
               Because the people who are crazy enough to think they can change the world, are the ones who do.
               """;
    }

    static void printStaringOccurrences(Character character, Integer occurrences){
        out.println("Words starting with '" + character + "' = " + occurrences);
    }

    static void printEndingOccurrences(Character character, Integer occurrences){
        out.println("Words ending with '" + character + "' = " + occurrences);
    }
}
