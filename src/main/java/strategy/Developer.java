package main.java.strategy;

public class Developer {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Activity getActivity() {
        return activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
