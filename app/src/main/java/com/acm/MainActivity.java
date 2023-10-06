package com.acm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private Toolbar myToolbar;
    private Button btnLogout;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(myToolbar);

        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(e -> {

            callLogout(this);
        });

        fab = findViewById(R.id.fabAdd);
        fab.setOnClickListener(e -> {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        });
    }

    private void callLogout(Context context) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Are you shure?");
        dialog.setMessage("Do you want leave?");
        dialog.setPositiveButton("Yes", (dialogInterface, i) -> {
            onDestroy();
        });
        dialog.setNegativeButton("No", (dialogInterface, i) -> {

        });
        dialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toobarbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuFind) {
            Toast.makeText(this, "Find", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.menuItemCart) {
            Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.menuItemConfig) {
            startActivity(new Intent(this, SettingsActivity.class));
        }
        if (item.getItemId() == R.id.menuItemAbout) {
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}