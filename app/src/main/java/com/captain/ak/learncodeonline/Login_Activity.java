package com.captain.ak.learncodeonline;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Login_Activity extends AppCompatActivity {

    private Toolbar mToolbar;

    private Button signup_btn;

    private ImageView imageView;



    private TextInputLayout mEmail;

    private TextInputLayout mPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        signup_btn = (Button)findViewById(R.id.signup_btn);

        mEmail = (TextInputLayout)findViewById(R.id.textInputLayout2);

        mPassword = (TextInputLayout)findViewById(R.id.textInputLayout);



        mToolbar = (Toolbar)findViewById(R.id.app_bar);
       setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");

        imageView = (ImageView)findViewById(R.id.imageView);

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signup_intent = new Intent(Login_Activity.this,Signup_Activity.class);

                Pair[] pairs = new Pair[4];

                pairs[0] = new Pair<View,String>(imageView,"logoTransition");
                pairs[1] = new Pair<View,String>(signup_btn,"btnTransition");
                pairs[2] = new Pair<View,String>(mEmail,"emailTransition");
                pairs[3] = new Pair<View,String>(mPassword,"passwordTransition");


                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login_Activity.this,pairs);

                startActivity(signup_intent,options.toBundle());
            }
        });

    }
}
