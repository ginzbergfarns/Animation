package com.olex.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView commonText;
    TextView hybrid;
    Boolean clicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        commonText = findViewById(R.id.commotText);
        hybrid = findViewById(R.id.commonText2);
        commonText.setX(1000);
        hybrid.setY(1000);

        commonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clicked) {
                    commonText.animate().alpha(0f).setDuration(400);
                    hybrid.animate().translationY(-100f).setDuration(1000);
                    clicked = true;
                } else  {
                    commonText.animate().alpha(1f).setDuration(1000);
                    hybrid.animate().translationY(0f).setDuration(400);
                    clicked = false;
                }

            }
        });
    }

    public void onClick(View buttonView) {
        commonText.animate().translationX(0);
        hybrid.animate().translationY(0);
    }
}
