package patterns.proxy;

public class BookProcessorProxy implements BookProcessor{
    private SimpleBookProcessor simpleBookProcessor;
    private final String content;

    public BookProcessorProxy(String content){
        this.content = content;
    }

    private void doLazyInstantiation(){
        if (simpleBookProcessor == null){
            simpleBookProcessor = new SimpleBookProcessor(content);
        }
    }

    @Override
    public Integer getQuantityOfWordsStartingWith(Character character) {
        doLazyInstantiation();
        return simpleBookProcessor.getQuantityOfWordsStartingWith(character);
    }

    @Override
    public Integer getQuantityOfWordsEndingWith(Character character) {
        doLazyInstantiation();
        return simpleBookProcessor.getQuantityOfWordsEndingWith(character);
    }
}
