package com.example.financialmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import org.json.JSONObject;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static MainActivity mainActivity;
    private Button btn_loginFB;
    private CallbackManager callbackManager;
    private TextView txtStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callbackManager = CallbackManager.Factory.create();
        mainActivity = this;
        btn_loginFB = findViewById(R.id.btn_login);
        btn_loginFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginFacebook();
            }
        });
        txtStatus = findViewById(R.id.txtStatus);
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                txtStatus.setText("" + loginResult.getAccessToken());
                GraphRequest requets = GraphRequest.newMeRequest(AccessToken.getCurrentAccessToken(),
                        new GraphRequest.GraphJSONObjectCallback() {
                            @Override
                            public void onCompleted(JSONObject object, GraphResponse response) {
                                String name = object.optString(getString(R.string.name));
                                String id = object.optString(getString(R.string.id));
                                String email = object.optString(getString(R.string.email));
                                Log.d("name" , name);
                                Log.d("id", id);
                                Log.d("email" , email);

                            }
                        });

            }

            @Override
            public void onCancel() {
            }

            @Override
            public void onError(FacebookException error) {

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
    private void loginFacebook(){
        LoginManager.getInstance().logInWithReadPermissions(this,
                Arrays.asList("public_profile", "email"));
    }

}
