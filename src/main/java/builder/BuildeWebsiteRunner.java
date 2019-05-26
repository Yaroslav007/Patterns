package main.java.builder;

import main.java.builder.facebook.FacebookBuilder;

public class BuildeWebsiteRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new FacebookBuilder());

        Website website = director.buildeWebsite();
        System.out.println(website);
    }

}
