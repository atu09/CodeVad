package com.aces.codevad;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcDialog;
import com.leo.simplearcloader.SimpleArcLoader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Atirek on 6/17/2016.
 */
public class LoginActivity extends AppCompatActivity {

    int color[] = {R.color.colorTheme, R.color.colorTheme};

    EditText et_username, et_password;
    FloatingActionButton fab_next;

    String url = "http://192.168.0.105/Demoroject1/SecondPg.php";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_username = (EditText) findViewById(R.id.et_login_username);
        et_password = (EditText) findViewById(R.id.et_login_password);
        fab_next = (FloatingActionButton) findViewById(R.id.fab_login_next);


        fab_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArcConfiguration configuration = new ArcConfiguration(LoginActivity.this);
                configuration.setLoaderStyle(SimpleArcLoader.STYLE.SIMPLE_ARC);
                configuration.setText("Loading..");
                configuration.setColors(color);

                final SimpleArcDialog mDialog = new SimpleArcDialog(LoginActivity.this);
                mDialog.setConfiguration(configuration);

                new AsyncTask<String, String, String>() {

                    String output = null;
                    String username = et_username.getText().toString();
                    String password = et_password.getText().toString();

                    @Override
                    protected String doInBackground(String... url) {

                        try {

                            //Creating NameValuePair to provide parameters...
                            ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                            //nameValuePairs.add(new BasicNameValuePair("uname", username));
                            //nameValuePairs.add(new BasicNameValuePair("pwd", password));

                            DefaultHttpClient httpClient = new DefaultHttpClient();
                            HttpPost httpPost = new HttpPost(url[0]);

                            //Adding nameValuePairs as a parameter...
                            //httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                            HttpResponse httpResponse = httpClient.execute(httpPost);
                            HttpEntity httpEntity = httpResponse.getEntity();
                            output = EntityUtils.toString(httpEntity);

                        } catch (IOException e) {

                            e.printStackTrace();

                        }

                        return output;
                    }

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();

                        mDialog.show();
                    }

                    @Override
                    protected void onPostExecute(String s) {
                        super.onPostExecute(s);
                        //s.trim();
                        mDialog.dismiss();

                        //Toast.makeText(LoginActivity.this, "Output ---> " + s, Toast.LENGTH_LONG).show();

                        //et_password.setText(s);

                        if (s.equals("right")) {

                            Toast.makeText(LoginActivity.this, "Successfully Logged In", Toast.LENGTH_LONG).show();

                        } else {
                            Toast.makeText(LoginActivity.this, "I Guess You are a New User", Toast.LENGTH_LONG).show();
                            Intent jump = new Intent(LoginActivity.this, SignUpActivity.class);
                            startActivity(jump);
                        }

                    }
                }.execute(url);

            }
        });

    }
}
