package com.example.grizzly.praktikumandroid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegister = (Button)findViewById(R.id.btn_register);
    }

    public void moveRegister(View view) {
        Intent intent = new Intent(MainActivity.this,Register.class );
        startActivity(intent);
    }
}
