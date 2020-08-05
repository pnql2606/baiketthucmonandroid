package com.example.btktandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ketqua extends AppCompatActivity {
    TextView ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);

        ketqua = (TextView) findViewById(R.id.ketqua);

        //Lấy dữ liệu de chat htu
        Intent intent = getIntent();
        ketqua.setText(intent.getStringExtra("SoLe"));
    }

    public void Back(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        ketqua.setText("");
    }
}