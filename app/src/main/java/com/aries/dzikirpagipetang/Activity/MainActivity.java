package com.aries.dzikirpagipetang.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.aries.dzikirpagipetang.MenuItem.AboutActivity;
import com.aries.dzikirpagipetang.MenuItem.SettingActivity;
import com.aries.dzikirpagipetang.R;

//import butterknife.ButterKnife;
//import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    CardView pagi_activity;
    CardView sore_activity;
    CardView dzikir_sholat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagi_activity = findViewById(R.id.pagi_activity);
        sore_activity = findViewById(R.id.sore_activity);
        dzikir_sholat = findViewById(R.id.dzikir_sholat);

        pagi_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, PagiActivity.class));

            }
        });

        sore_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, SoreActivity.class));
            }
        });

        dzikir_sholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, DzikirSholatActivity.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about){
            startActivity(new Intent(this, AboutActivity.class));
        } else if (item.getItemId() == R.id.setting){
            startActivity(new Intent(this, SettingActivity.class));
        }

        return true;
    }
}
