package com.bankmtk.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] cities ={"Moscow","St. Peterburg","Novosibirsk","Ekaterinburg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout list = findViewById(R.id.layout);
        final Activity that = this;
        for (String city: cities){
            TextView cityView = new TextView(that);
            cityView.setText(city);
            cityView.setTextSize(42);
            cityView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(that,String.format("Selected city - %s",
                            ((TextView)v).getText()),Toast.LENGTH_SHORT).show();
                }
            });
            list.addView(cityView);
        }
    }
}
