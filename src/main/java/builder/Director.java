package main.java.builder;

public class Director {

    WebsiteBuilder websiteBuilder;

    public void setBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    public Website buildeWebsite(){
        websiteBuilder.createWebsite();
        websiteBuilder.setName();
        websiteBuilder.setCms();
        websiteBuilder.setPrice();
        return websiteBuilder.getWebsite();
    }
}
