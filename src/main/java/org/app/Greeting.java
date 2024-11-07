package org.app;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    public String getGreeting(String name) {
        return "Hi " + name + "!";
    }
}
