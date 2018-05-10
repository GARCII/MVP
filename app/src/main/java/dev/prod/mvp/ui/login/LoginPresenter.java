package dev.prod.mvp.ui.login;

import android.content.Context;

import dev.prod.mvp.ui.base.BasePresenter;


class LoginPresenter extends BasePresenter implements LoginContract.Presenter {

    private LoginContract.View view;
    private Context context;



    LoginPresenter(LoginContract.View view, Context context) {
        this.view = view;
        this.context = context;
    }


    @Override
    public void login(String email, String password) {
       if(email.equals("admin") && password.equals("admin")){
           view.navigateToHome();
       }else{
           view.onError("Email or password is invalide");
       }
    }
}
