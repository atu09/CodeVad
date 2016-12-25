package com.aces.codevad.CustomFontsExtensions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Atirek on 6/11/2016.
 */
public class MyTextViewBook extends TextView {

    public MyTextViewBook(Context context) {
        super(context);
        init();
    }

    public MyTextViewBook(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewBook(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @SuppressLint("NewApi")
    public MyTextViewBook(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void init() {
        if (!isInEditMode()) {
            Typeface custom_font = Typeface.createFromAsset(getContext().getAssets(), "fonts/GothamRounded-Book.otf");
            MyTextViewBook tv = this;
            tv.setTypeface(custom_font);
        }
    }
}
