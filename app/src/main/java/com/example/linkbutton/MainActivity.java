package com.example.linkbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openActivity2();

            }
        });
    }
    public void openActivity2()
    {
        Intent intent=new Intent(this,Link_Activity.class);
        startActivity(intent);
        //this is my test file
        //hey what happens when i only commit but not push
    }
}
