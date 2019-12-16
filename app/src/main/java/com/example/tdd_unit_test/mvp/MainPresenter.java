package com.example.tdd_unit_test.mvp;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mvpView;

    MainPresenter(MainContract.MvpView view) {
        mvpView = view;
    }

    @Override
    public void handleSignInButtonClick() {
        mvpView.navigateToSignIn();
    }

    @Override
    public void handleSignUpButtonClick() {
        mvpView.navigateToSignUp();
    }
}
