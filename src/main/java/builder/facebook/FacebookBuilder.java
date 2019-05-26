package main.java.builder.facebook;

import main.java.builder.Cms;
import main.java.builder.WebsiteBuilder;

public class FacebookBuilder extends WebsiteBuilder {


    @Override
    public void setName() {
        website.setName("Facebook");
    }

    @Override
    public void setCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    public void setPrice() {
        website.setPrice(10000);
    }
}
