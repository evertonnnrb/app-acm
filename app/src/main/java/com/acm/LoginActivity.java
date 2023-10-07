package com.acm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.acm.model.User;
import com.acm.util.UtilMockUsers;

public class LoginActivity extends AppCompatActivity {

    private User user;
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
                if (effectLogin()) {
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra("user",user);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }

    private boolean effectLogin() {
        user = new User(edtLoginEmail.getText().toString(), edtLoginPassword.getText().toString());
        if (UtilMockUsers.getUsers().contains(user)) {
            Toast.makeText(this, "Valido", Toast.LENGTH_SHORT).show();
            return true;
        }
        Toast.makeText(this, "Inválido", Toast.LENGTH_SHORT).show();
        return false;
    }

    private boolean validateEmptyEditText(EditText editText) {
        if (editText.getText().toString().equals("")) {
            editText.setError(getString(R.string.this_field_is_required));
            return false;
        }
        return true;
    }
}