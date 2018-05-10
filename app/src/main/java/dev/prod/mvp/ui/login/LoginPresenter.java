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
        appPreferencesHelper = new AppPreferencesHelper(context,"PREFERENCE_USER");
    }


    @Override
    public void login(String email, String password) {

       if(!email.equals("admin") && !password.equals("admin")){
           view.onError("Email or password is invalide");
       }else{
           appPreferencesHelper.setConnected(true);
           view.navigateToHome();
       }
    }
}
