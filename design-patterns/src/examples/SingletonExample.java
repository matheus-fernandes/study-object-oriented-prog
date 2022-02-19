package examples;

import patterns.singleton.SingletonChat;

import static java.lang.System.*;
import static util.Util.*;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonChat chat = SingletonChat.getChat();

        chat.write("Matheus", "Hello Michelle!");
        sleep(1000);

        chat.write("Michelle", "Hi Matheus!");
        sleep(100);

        out.println(chat);
    }
}
