package dev.prod.mvp.ui.home;



import dev.prod.mvp.ui.base.BaseContract;

/**
 * Created by SKIIN on 02/07/2017.
 */

public interface HomeContract {


    interface View extends BaseContract.View {
        void bindComponent();
        void navigateToLogin();
    }


    interface Presenter extends BaseContract.Presenter {
        void logout();
    }


}
