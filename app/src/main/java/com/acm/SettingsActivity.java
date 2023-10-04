package com.acm;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class SettingsActivity extends AppCompatActivity {

    private SwitchCompat switchCompat;

    private CheckBox checkBoxSDCard, checkBoxInstallAtualizations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        switchCompat = findViewById(R.id.switchOptions);
        checkBoxSDCard = findViewById(R.id.checkBoxOptionSaveONSDCard);
        checkBoxInstallAtualizations = findViewById(R.id.checkBoxInstall);
        
        switchCompat.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Checked", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Not checked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}