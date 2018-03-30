package com.apps.matlei.goodvibrations;

import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
    }

    @OnClick(R.id.starwarstheme)
    void vibrateNow() {
        Toast.makeText(this, "Imperium Ftw!", Toast.LENGTH_SHORT).show();
        long[] pattern = new long[]{0, 500, 110, 500, 110, 450, 110, 200, 110, 170, 40, 450, 110, 200, 110, 170, 40, 500};
        vibrator.vibrate(pattern, -1);
    }

    @OnClick(R.id.goodvibrations)
    void vibrateGood() {
        Toast.makeText(this, "Ooh ooh, good vibrations!", Toast.LENGTH_SHORT).show();
        // the first 0 => Start without a delay
        // Each element after index 0 then alternates between vibrate, sleep, vibrate, sleep...
        long[] pattern = {0, 500, 200, 500, 200, 500, 250, 300, 100, 300, 100, 350, 80, 350};
        vibrator.vibrate(pattern, -1);
    }

    @OnClick(R.id.celebrate)
    void vibrateGoodTimes() {
        Toast.makeText(this, getString(R.string.ceeelebrate_good_times_come_on), Toast.LENGTH_SHORT).show();

        long[] pattern = {0, 1050, 200, 300, 200, 400, 250, 300, 100, 400, 100, 250, 100, 250};
        vibrator.vibrate(pattern, -1);
    }

}
