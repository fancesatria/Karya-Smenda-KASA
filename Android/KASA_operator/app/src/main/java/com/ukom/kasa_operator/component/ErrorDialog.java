package com.ukom.kasa_operator.component;

import android.content.Context;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.ukom.kasa_operator.R;

public class ErrorDialog {

    static Snackbar snackbar;

    public static void message(Context context,String message, View view){
        snackbar = Snackbar.make(view,message, BaseTransientBottomBar.LENGTH_SHORT);
        snackbar.setTextColor(ContextCompat.getColor(context, R.color.white));
        snackbar.setBackgroundTint(ContextCompat.getColor(context, R.color.error));

        snackbar.show();
    }
}
