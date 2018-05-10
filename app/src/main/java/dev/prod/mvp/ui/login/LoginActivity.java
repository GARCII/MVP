package dev.prod.mvp.ui.login;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


import dev.prod.mvp.R;
import dev.prod.mvp.data.preferences.AppPreferencesHelper;
import dev.prod.mvp.ui.base.BaseActivity;
import dev.prod.mvp.ui.home.HomeActivity;

public class LoginActivity extends BaseActivity implements LoginContract.View {


    private LoginContract.Presenter presenter;
    private Button login;
    private EditText password,email;
    private AppPreferencesHelper appPreferencesHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginPresenter(this, getApplicationContext());
        bindComponent();


        login.setOnClickListener(v -> {
            presenter.login(email.getText().toString(),password.getText().toString());
        });

    }

    @Override
    public void bindComponent() {
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, HomeActivity.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(appPreferencesHelper.getConnected()){
            navigateToHome();
        }
    }
}
