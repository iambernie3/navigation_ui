package com.gte.fragmentspike.presenter.interfaces;

import android.util.Log;

public interface Login {
    int isLogin = 0;
    default void loginNow() {
    }
    default void loginMe() {

    }

    //Login loginThisTime = () -> System.out.println("Stars!!!");
}
