package org.example;

public class SMSSubscriber implements Subscriber {
    private String phoneNumber;
    private String name;
    private String recentMessage;

    public SMSSubscriber(String name, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public void getNewsletter(String newsletterName, String headline, String content) {
        System.out.print("Hi " + this.name + ", ");
        System.out.println(newsletterName + " published a new email! \n");
        System.out.println("Title: " + headline);
        System.out.println(
                "Content: " + content + "\n__________________________________________________________________");
        this.recentMessage = content;
    }

    public String getName() {
        return this.name;
    }

    public String getRecentMessage() {
        return this.recentMessage;
    }
}