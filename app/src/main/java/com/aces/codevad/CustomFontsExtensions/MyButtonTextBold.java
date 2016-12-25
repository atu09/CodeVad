package com.aces.codevad.CustomFontsExtensions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Atirek on 6/11/2016.
 */
public class MyButtonTextBold extends Button {

    public MyButtonTextBold(Context context) {
        super(context);
        init();
    }

    public MyButtonTextBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButtonTextBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @SuppressLint("NewApi")
    public MyButtonTextBold(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {
        if (!isInEditMode()) {
            Typeface custom_font = Typeface.createFromAsset(getContext().getAssets(), "fonts/GothamRounded-Bold.otf");
            MyButtonTextBold btn = this;
            btn.setTypeface(custom_font);
        }
    }

}
