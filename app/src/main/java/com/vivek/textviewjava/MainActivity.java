package com.vivek.textviewjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView,textView2;
StringBuilder stringBuilder = new StringBuilder("vivugitdev");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      textView = findViewById(R.id.textview1);
        textView2 = findViewById(R.id.textview2);

      textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

      textView.setText(stringBuilder.append(" Get Free Source Code"));

      textView2.setText(stringBuilder.reverse());


    }

    public void clickhere(View view) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
}