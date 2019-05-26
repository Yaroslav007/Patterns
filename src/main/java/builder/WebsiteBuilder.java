package main.java.builder;

public abstract class WebsiteBuilder {

    public Website website;

    void createWebsite(){
        website = new Website();
    }

    public abstract void setName();
    public abstract void setCms();
    public abstract void setPrice();

    public Website getWebsite() {
        return website;
    }
}
