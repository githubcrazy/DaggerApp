package com.example.ishanpant.daggerapp;

import android.content.ContentValues;
import android.content.Context;
import android.widget.Toast;

public class ABC implements inteABC {

    private Context context;

    public ABC(Context context) {
        this.context = context;
    }

    @Override
    public String greet(String username) {
        Toast.makeText(context , "Hello" + username , Toast.LENGTH_SHORT).show();
        return username;
    }
}
