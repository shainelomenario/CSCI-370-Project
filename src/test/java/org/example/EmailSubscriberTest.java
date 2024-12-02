package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailSubscriberTest {

    @Test
    void observerReceivesNewsletterContent() {

        Newsletter techNewsletter = new Newsletter("Tech Updates");
        Newsletter sportsNewsletter = new Newsletter("Sports");

        Subscriber bob = new EmailSubscriber("Bob", "bob@example.com");
        Subscriber eric = new SMSSubscriber("Eric", "eric@example.com");

        techNewsletter.addSubscriber(bob);
        sportsNewsletter.addSubscriber(eric);

        techNewsletter.notifySubscribers("M3 Pro News", "M3 Pro Macbook released today");
        sportsNewsletter.notifySubscribers("Yankees Win Decisively in Game 4", "Yankees beat Red Sox 9-4, home advantage comes back to the Yanks!");

        String recentMessage = bob.getRecentMessage();
        String recentMessage2 = eric.getRecentMessage();
        assertEquals("M3 Pro Macbook released today", recentMessage);
        assertEquals("Yankees beat Red Sox 9-4, home advantage comes back to the Yanks!", recentMessage2);

    }

    @Test
    void observerGetsNoMessagesAfterUnsubscribing() {
        Newsletter techNewsletter = new Newsletter("Tech Updates");
        Subscriber bob = new EmailSubscriber("Bob", "bob@example.com");
        techNewsletter.addSubscriber(bob);

        techNewsletter.notifySubscribers("M3 Pro News", "M3 Pro Macbook released today");
        techNewsletter.removeSubscriber(bob);
        techNewsletter.notifySubscribers("M4 Pro News", "M4 Pro Macbook released today");

        String recentMessage = bob.getRecentMessage();
        System.out.println("Recent Message: " + recentMessage);

        assertNotEquals("M5 Pro Macbook released today", recentMessage);
    }

}