package ir.nobka.momenium.changeapplanguageatruntime;

import android.content.Context;
import android.content.SharedPreferences;

public class ShareManager {

    private static ShareManager shareManager;
    private static SharedPreferences preferences;
    private static SharedPreferences.Editor editor;

    private ShareManager(){}

    public static ShareManager getInstance(Context ctx){
        if (shareManager == null){
            shareManager = new ShareManager();
            preferences = ctx.getSharedPreferences("mommmo",Context.MODE_PRIVATE);
            editor = preferences.edit();
            editor.apply();
        }
        return shareManager;
    }


    public void setLang(String ss){
        editor.putString("lang",ss);
        editor.apply();
    }

    public String getLang(){
        return preferences.getString("lang","fr");
    }

    public void setFirst(boolean a){
        editor.putBoolean("firstOne",a);
        editor.apply();
    }
}
