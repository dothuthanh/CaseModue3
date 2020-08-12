package com.codegym.servic;

import com.codegym.model.LoginUser;

public interface IUser {
    LoginUser findUserLogin(String email, String password);
}
