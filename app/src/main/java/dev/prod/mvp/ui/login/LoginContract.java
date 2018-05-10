package dev.prod.mvp.ui.login;


import dev.prod.mvp.ui.base.BaseContract;

interface LoginContract {




    interface View extends BaseContract.View{
        void bindComponent();
        void navigateToHome();

    }


    interface Presenter extends BaseContract.Presenter{
       void login(String email,String password);
    }





}
