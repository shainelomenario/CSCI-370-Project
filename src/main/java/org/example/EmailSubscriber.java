package org.example;

public class EmailSubscriber implements Subscriber {
    private String name;
    private String email;
    private String recentMessage;

    public EmailSubscriber(String name, String email) {
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return this.email;
    }

    public String getRecentMessage() {
        return this.recentMessage;
    }

}
