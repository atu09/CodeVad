package com.aces.codevad.CustomFontsExtensions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Atirek on 6/11/2016.
 */
public class MyEditTextMedium extends EditText {
    public MyEditTextMedium(Context context) {
        super(context);
        init(context);
    }

    public MyEditTextMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyEditTextMedium(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @SuppressLint("NewApi")
    public MyEditTextMedium(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    public void init(Context context) {
        if (!isInEditMode()) {
            Typeface custom_font = Typeface.createFromAsset(context.getAssets(), "fonts/GothamRounded-Medium.otf");
            MyEditTextMedium et = MyEditTextMedium.this;
            et.setTypeface(custom_font);
        }
    }
}
