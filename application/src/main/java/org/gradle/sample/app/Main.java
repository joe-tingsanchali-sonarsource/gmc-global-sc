package org.gradle.sample.app;

import org.gradle.sample.list.LinkedList;

import static org.gradle.sample.utilities.StringUtils.join;
import static org.gradle.sample.utilities.StringUtils.split;
import static org.gradle.sample.app.MessageUtils.getMessage;

public class Main {
    public static String getGreeting() {
        System.out.println("HELLO EARTHLINGSSSSSSSSSS");
        return "Hello world.";
    }

    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());

        System.out.println(join(tokens));
        System.out.println(getGreeting());
    }
}
