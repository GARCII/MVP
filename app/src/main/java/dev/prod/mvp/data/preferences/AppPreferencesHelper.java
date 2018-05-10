
package dev.prod.mvp.data.preferences;


import android.content.Context;
import android.content.SharedPreferences;



public class AppPreferencesHelper implements PreferencesHelper {

    private final SharedPreferences mPrefs;
    private static final String PREF_KEY_CONNECTED = "PREF_KEY_CONNECTED";



    public AppPreferencesHelper(Context context, String prefName) {
        mPrefs = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
    }


    @Override
    public boolean getConnected() {
        return mPrefs.getBoolean(PREF_KEY_CONNECTED, false);
    }

    @Override
    public void setConnected(boolean connected) {
        mPrefs.edit().putBoolean(PREF_KEY_CONNECTED, connected).apply();
    }
}
