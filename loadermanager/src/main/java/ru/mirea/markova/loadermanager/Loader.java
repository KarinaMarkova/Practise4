package ru.mirea.markova.loadermanager;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;


import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyLoader extends AsyncTaskLoader<String> {

    private String firstName;
    public static final String ARG_WORD = "word";
    public MyLoader(@NonNull Context context, Bundle args) {
        super(context);
        if (args != null)
            firstName = args.getString(ARG_WORD);
    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
    @Override

    public String loadInBackground() {
        // emulate long-running operation
        SystemClock.sleep(5000);
        return firstName;
    }
}

