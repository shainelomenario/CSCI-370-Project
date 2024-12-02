package org.example;

import java.util.List;
import java.util.ArrayList;

// Subject: Newsletter
public class Newsletter {
    private String name;
    List<Subscriber> subscribers = new ArrayList<>();

    public Newsletter(String name) {
        this.name = name;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " added to " + this.name);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber removed");
    }

    public void notifySubscribers(String title, String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.getNewsletter(this.name, title, message);
        }
    }

    public void listSubscribers() {
        for (Subscriber subscriber : subscribers) {
            System.out.println(subscriber.getName());
        }
    }
}
