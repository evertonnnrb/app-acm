package com.acm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private ImageView imageViewUserLogin;
    private EditText edtLoginEmail, edtLoginPassword;
    private Button buttonLogin;
    private CheckBox checkBoxKeepMeConnected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageViewUserLogin = findViewById(R.id.imgViewLogin);
        edtLoginEmail = findViewById(R.id.edtLoginEmail);
        edtLoginPassword = findViewById(R.id.edtLoginPassword);
        checkBoxKeepMeConnected = findViewById(R.id.checkBoxKeepConnected);
        //TODO impletation of sharedPref save keep connected
        buttonLogin = findViewById(R.id.btnLogin);
        buttonLogin.setOnClickListener(e -> {
            if (validateEmptyEditText(edtLoginEmail) && validateEmptyEditText(edtLoginPassword)) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private boolean validateEmptyEditText(EditText editText) {
        if (editText.getText().toString().equals("")) {
            editText.setError(getString(R.string.this_field_is_required));
            return false;
        }
        return true;
    }
}