package com.developer.vpnmasster.view;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.developer.vpnmasster.R;

public class About extends AppCompatActivity {

    ImageView backToActivity;
    TextView activity_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        activity_name = findViewById(R.id.activity_name);
        backToActivity = findViewById(R.id.finish_activity);

        activity_name.setText(R.string.about);
        backToActivity.setOnClickListener(view -> finish());

    }
}
