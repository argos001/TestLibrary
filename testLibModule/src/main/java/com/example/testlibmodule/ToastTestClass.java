package com.example.testlibmodule;

import android.content.Context;
import android.widget.Toast;

public class ToastTestClass {

    public static void s(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
