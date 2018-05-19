package com.example.grizzly.praktikumandroid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnSubmit = (Button)findViewById(R.id.btn_submit_reg);
    }

    public void submit(View view) {
        Toast.makeText(this, "Sudah submit", Toast.LENGTH_LONG).show();
    }
}
