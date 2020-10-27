package kr.hs.emirim.s2019w39.frametest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearMoonstar, linearSolar, linearWheein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearMoonstar = findViewById(R.id.linear_moonstar);
        linearSolar = findViewById(R.id.linear_solar);
        linearWheein = findViewById(R.id.linear_wheein);

        Button btnMoonstar = findViewById(R.id.btn_moonstar);
        Button btnSolar = findViewById(R.id.btn_solar);
        Button btnWheein = findViewById(R.id.btn_wheein);

        btnMoonstar.setOnClickListener(btnListener);
        btnSolar.setOnClickListener(btnListener);
        btnWheein.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearMoonstar.setVisibility(View.INVISIBLE);
            linearSolar.setVisibility(View.INVISIBLE);
            linearWheein.setVisibility(View.INVISIBLE);

            switch (v.getId()) {
                case R.id.btn_moonstar:
                    linearMoonstar.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_solar:
                    linearSolar.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_wheein:
                    linearWheein.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}