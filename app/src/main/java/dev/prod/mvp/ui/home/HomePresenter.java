package dev.prod.mvp.ui.home;



import android.content.Context;

import dev.prod.mvp.data.preferences.AppPreferencesHelper;

/**
 * Created by SKIIN on 10/05/2018.
 */


public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.View view;
    private Context context;
    private AppPreferencesHelper appPreferencesHelper;

    HomePresenter(HomeContract.View view, Context context) {
        this.view = view;
        this.context = context;
        appPreferencesHelper = new AppPreferencesHelper(context,"PREF_KEY_CONNECTED");

    }


    @Override
    public void logout() {
        appPreferencesHelper.setConnected(false);
        view.navigateToLogin();
    }
}
