package com.example.mariya.jsonparse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {

    TextView editText_address,editText_email;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //FindviewByIds
        editText_address = (TextView) findViewById(R.id.editText_address);
        editText_email = (TextView) findViewById(R.id.editText_email);
        btn_back = (Button) findViewById(R.id.btn_back);

       //back
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}