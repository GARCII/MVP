package dev.prod.mvp.ui.home;



import android.content.Context;
/**
 * Created by SKIIN on 03/07/2017.
 */


public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.View view;
    private Context context;

    HomePresenter(HomeContract.View view, Context context) {
        this.view = view;
        this.context = context;

    }




}
