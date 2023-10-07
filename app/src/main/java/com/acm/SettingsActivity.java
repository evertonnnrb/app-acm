package com.acm;

import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
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
                createDialog(this).show();
            } else {
                Toast.makeText(this, "Not checked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private AlertDialog.Builder createDialog(Context context){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Reminder a option");
        String[] options = {"Yes", "No"};
        builder.setSingleChoiceItems(options,-1,null);
        builder.setPositiveButton("OK",null)
                .setNegativeButton("After",null);
        builder.create();
        return builder;
    }
}