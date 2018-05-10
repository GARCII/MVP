package dev.prod.mvp.ui.home;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dev.prod.mvp.R;
import dev.prod.mvp.data.preferences.AppPreferencesHelper;
import dev.prod.mvp.ui.base.BaseActivity;
import dev.prod.mvp.ui.login.LoginActivity;


public class HomeActivity extends BaseActivity implements HomeContract.View {



    private HomeContract.Presenter presenter;
    private Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        presenter = new HomePresenter(this,getApplicationContext());
        bindComponent();

        logout.setOnClickListener(v -> {
           presenter.logout();
        });
    }


    @Override
    public void bindComponent() {
       logout = findViewById(R.id.logout);
    }

    @Override
    public void navigateToLogin() {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
