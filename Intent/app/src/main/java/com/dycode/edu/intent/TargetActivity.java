package com.dycode.edu.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "EXTRA_DATA";

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = (TextView)findViewById(R.id.TextView);

        //get data
        if (getIntent().getExtras()!=null){
            String data = getIntent().getExtras().getString(TargetActivity.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}
