package dev.prod.mvp.ui.login;


import android.os.Bundle;


import dev.prod.mvp.R;
import dev.prod.mvp.ui.base.BaseActivity;

public class LoginActivity extends BaseActivity implements LoginContract.View {


    private LoginContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginPresenter(this, getApplicationContext());

    }










    @Override
    public void onStart() {
        super.onStart();



    }

    @Override
    public void onStop() {
        super.onStop();

    }

}
