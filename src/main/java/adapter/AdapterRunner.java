package main.java.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        Database database = new JavaObjectAdapterToDatabase();

        database.create();
        database.update();
        database.get();
        database.remove();
    }
}
