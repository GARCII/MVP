package dev.prod.mvp.ui.login;

import android.content.Context;

import dev.prod.mvp.data.preferences.AppPreferencesHelper;
import dev.prod.mvp.ui.base.BasePresenter;


class LoginPresenter extends BasePresenter implements LoginContract.Presenter {

    private LoginContract.View view;
    private Context context;
    private AppPreferencesHelper appPreferencesHelper;


    LoginPresenter(LoginContract.View view, Context context) {
        this.view = view;
        this.context = context;
        appPreferencesHelper = new AppPreferencesHelper(context,"PREF_KEY_CONNECTED");
    }


    @Override
    public void login(String email, String password) {

       if(email.equals("mvp@admin.com") && password.equals("admin")){
           appPreferencesHelper.setConnected(true);
           view.navigateToHome();

       }else{
           view.onError("Email or password is invalide");
       }
    }
}
