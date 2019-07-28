package ir.nobka.momenium.changeapplanguageatruntime;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    ShareManager shareManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnChangeLangView).setOnClickListener(v -> {
            if (shareManager.getLang().equals("fr")){
                shareManager.setLang("en");
                recreate();
            }else {
                shareManager.setLang("fr");
                recreate();
            }
        });
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        shareManager = ShareManager.getInstance(this);
        super.attachBaseContext(MyContextWrapper.wrap(newBase, shareManager.getLang()));
    }
}
