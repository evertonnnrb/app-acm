package com.acm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.acm.model.User;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private User user;
    private Toolbar myToolbar;
    private Button btnLogout;
    private FloatingActionButton fab;

    private TextView txtEmailUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (User) getIntent().getSerializableExtra("user");

        myToolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(myToolbar);

        txtEmailUser = findViewById(R.id.txtEmailUser);
        txtEmailUser.setText(getString(R.string._id) + user.getEmail());

        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(e -> {
            callLogout(this).show();
        });

        fab = findViewById(R.id.fabAdd);
        fab.setOnClickListener(e -> {
            startActivity(new Intent(this, BudGetActivity.class));
        });
    }

    private AlertDialog callLogout(Context context) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context, R.style.AlertDialog);
        dialog.setTitle("Are you shure?");
        dialog.setMessage("Do you want leave?");
        dialog.setPositiveButton("Yes", (dialogInterface, i) -> {
            finish();
        });
        dialog.setNegativeButton("No", (dialogInterface, i) -> {
            dismissDialog(0);
        });

        return dialog.create();
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