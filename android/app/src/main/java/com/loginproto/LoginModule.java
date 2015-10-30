package com.loginproto;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by marthaelena on 10/21/15.
 */
public class LoginModule extends ReactContextBaseJavaModule {

    private static final String VALIDATE_CREDENTIALS = "validate_credentials";

    private String username;
    private String password;

    public LoginModule(ReactApplicationContext context) {
        super(context);
    }

    @ReactMethod
    public void show(String message) {
        Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @ReactMethod
    public void getCredentials(String username, String password) {
        this.username = username;
        this.password = password;

        boolean isValid = validateCredentials(this.username, this.password);

        Intent validateCredentials = new Intent(VALIDATE_CREDENTIALS);
        validateCredentials.putExtra("IS_VALID", isValid);
        LocalBroadcastManager.getInstance(getReactApplicationContext()).sendBroadcast(validateCredentials);
    }

    public boolean validateCredentials(String username, String password) {
        if (username.equals("marthaloera") && password.equals("skycatchdrone")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getName() {
        return "LoginModule";
    }

}
