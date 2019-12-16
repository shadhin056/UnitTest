package com.example.tdd_unit_test.mvp;

public interface MainContract {
    interface MvpView{
        void navigateToSignIn();
        void navigateToSignUp();
    }
    interface Presenter{
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }
}
