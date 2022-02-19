package patterns.singleton;

import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDateTime.*;

public class SingletonChat {
    private static SingletonChat chat;

    private List<Message> messages;

    private SingletonChat(){
        this.messages = new ArrayList<>();
    }

    public void write(String author, String content){
        messages.add(new Message(now(), author, content));
    }

    public List<Message> getMessages() {
        return messages;
    }

    public static SingletonChat getChat(){
        if (chat == null){
            chat = new SingletonChat();
        }
        return chat;
    }

    @Override
    public String toString() {
        return "SingletonChat{" +
                "messages=" + messages +
                '}';
    }
}
