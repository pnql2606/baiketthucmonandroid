package com.example.btktandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textView2;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (EditText) findViewById(R.id.textView2);
        btnAdd = (Button) findViewById(R.id.button);
    }

    public void  Show(View v)
    {
        if(textView2.getText().toString().trim() != "" )
        {
            int n = Integer.parseInt(textView2.getText().toString()) ;
            String s = "";

            for(int i=1; i<=n ; i++)
                if(i%2!=0)
                    s += i + " ";


            Intent intent = new Intent(this, ketqua.class);
            intent.putExtra("SoLe",s);
            startActivity(intent);
            textView2.setText("");
        }
        else
            Toast.makeText(MainActivity.this, "Hãy nhập số n", Toast.LENGTH_SHORT).show();
    }
}