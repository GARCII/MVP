package dev.prod.mvp.ui.home;


import android.os.Bundle;

import dev.prod.mvp.ui.base.BaseActivity;


public class HomeActivity extends BaseActivity implements HomeContract.View {



    HomeContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new HomePresenter(this,getApplicationContext());

    }


}
