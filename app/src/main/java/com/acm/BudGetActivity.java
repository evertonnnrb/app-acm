package com.acm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.acm.adapter.AdapterBudGet;
import com.acm.model.BudGet;

import java.util.List;

public class BudGetActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button buttonRegister;
    private AdapterBudGet adapterBudGet;
    private List<BudGet> budGetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bud_get);

        buttonRegister = findViewById(R.id.btnRegisterOnRv);
        buttonRegister.setOnClickListener(e -> {
            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
        });
    }
}