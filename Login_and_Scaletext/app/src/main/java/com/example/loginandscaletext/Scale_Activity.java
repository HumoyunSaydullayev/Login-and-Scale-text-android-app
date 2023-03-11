package com.example.loginandscaletext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Scale_Activity extends AppCompatActivity {
    int text_size=19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        TextView scale_text=findViewById(R.id.Scale_text);
        Button up=findViewById(R.id.up);
        Button down=findViewById(R.id.down);
        TextView size=findViewById(R.id.size);
        size.setText("Text size: "+text_size);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text_size<55){
                    text_size=text_size+3;
                    scale_text.setTextSize(text_size);
                    size.setText("Text size: "+text_size);
                    down.setEnabled(true);
                }else{
                    Toast.makeText(Scale_Activity.this, "Max size", Toast.LENGTH_SHORT).show();
                    up.setEnabled(false);
                }

            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text_size>13){
                    text_size=text_size-3;
                    scale_text.setTextSize(text_size);
                    size.setText("Text size: "+text_size);
                    up.setEnabled(true);
                }else{
                    Toast.makeText(Scale_Activity.this, "Min size", Toast.LENGTH_SHORT).show();
                    down.setEnabled(false);
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(Scale_Activity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}