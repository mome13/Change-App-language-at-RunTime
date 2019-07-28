package ir.nobka.momenium.changeapplanguageatruntime;

import android.app.Application;

public class App extends Application {

    ShareManager shareManager;
    @Override
    public void onCreate() {
        super.onCreate();
        shareManager = ShareManager.getInstance(this);
    }
}
