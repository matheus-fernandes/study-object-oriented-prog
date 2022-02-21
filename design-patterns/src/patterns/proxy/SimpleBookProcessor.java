package patterns.proxy;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static java.lang.Character.*;

public class SimpleBookProcessor implements BookProcessor{
    private final String content;

    Map<Character, Integer> quantityOfWordsStartingWithCharacter;
    Map<Character, Integer> quantityOfWordsEndingWithCharacter;

    public SimpleBookProcessor(String content){
        this.content = content;
        this.quantityOfWordsEndingWithCharacter = new HashMap<>();
        this.quantityOfWordsStartingWithCharacter = new HashMap<>();

        processContent();
    }

    private void processContent(){
        for (String word: content.split(" ")){
            processWord(word.toUpperCase());
        }
    }

    private void processWord(String word){
        incrementFirstCharacterCount(firstCharacter(word));
        incrementLastCharacterCount(lastCharacter(word));

    }

    private Character firstCharacter(String word){
        return valueOf(word.charAt(0));
    }

    private void incrementFirstCharacterCount(Character character){
        Integer quantity = quantityOfWordsStartingWithCharacter
                .getOrDefault(toUpperCase(character), 0);

        quantityOfWordsStartingWithCharacter.put(character, quantity + 1);
    }

    private Character lastCharacter(String word){
        return valueOf(word.charAt(word.length()-1));
    }

    private void incrementLastCharacterCount(Character character){
        Integer quantity = quantityOfWordsEndingWithCharacter
                .getOrDefault(character, 0);

        quantityOfWordsEndingWithCharacter.put(character, quantity + 1);
    }

    @Override
    public Integer getQuantityOfWordsStartingWith(Character character){
        return quantityOfWordsStartingWithCharacter.getOrDefault(character, 0);
    }

    @Override
    public Integer getQuantityOfWordsEndingWith(Character character){
        return quantityOfWordsEndingWithCharacter.getOrDefault(character, 0);
    }
}
