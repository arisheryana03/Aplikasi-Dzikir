package com.aries.dzikirpagipetang.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.CompoundButton;

import com.aries.dzikirpagipetang.R;

public class SettingActivity extends AppCompatActivity {
    public static boolean mIsNightMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        getSupportActionBar().setTitle("Setting");

        //Add button back
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SwitchCompat switchCompat = findViewById(R.id.switch_dark_mode);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mIsNightMode = b;
                int delayTime = 200;
                compoundButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mIsNightMode) {
                            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                        } else {
                            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                        }
                    }
                }, delayTime);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home);
            this.finish();
            return super.onOptionsItemSelected(item);
    }
}
