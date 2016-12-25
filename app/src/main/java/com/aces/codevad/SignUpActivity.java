package com.aces.codevad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.github.clans.fab.FloatingActionButton;

/**
 * Created by Atirek on 6/17/2016.
 */
public class SignUpActivity extends AppCompatActivity {

    EditText et_name, et_password, et_phoneNo;
    FloatingActionButton fab_next;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        et_name = (EditText) findViewById(R.id.et_signup_name);
        et_password = (EditText) findViewById(R.id.et_signup_password);
        et_phoneNo = (EditText) findViewById(R.id.et_signup_phoneNo);
        fab_next = (FloatingActionButton) findViewById(R.id.fab_signup_next);

    }
}
