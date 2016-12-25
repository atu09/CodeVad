package com.aces.codevad.CustomFontsExtensions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Atirek on 6/11/2016.
 */
public class MyTextViewMedium extends TextView {

    public MyTextViewMedium(Context context) {
        super(context);
        init();
    }

    public MyTextViewMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewMedium(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @SuppressLint("NewApi")
    public MyTextViewMedium(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {
        if (!isInEditMode()) {
            Typeface custom_font = Typeface.createFromAsset(getContext().getAssets(), "fonts/GothamRounded-Medium.otf");
            MyTextViewMedium tv = this;
            tv.setTypeface(custom_font);
        }
    }

}
