package main.java.adapter;

public class JavaObjectAdapterToDatabase extends JavaObjectDBManager implements Database {
    @Override
    public void create() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void get() {
        getObject();
    }

    @Override
    public void remove() {
        removeObject();
    }
}
