package org.example;

public interface Subscriber {
    void getNewsletter(String newsletterName, String headline, String content);

    String getName();
    String getRecentMessage();

}