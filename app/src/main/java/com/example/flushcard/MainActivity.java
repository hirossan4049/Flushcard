package com.example.flushcard;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Word apple = new Word(R.drawable.apple_two,"りんご");
    Word banana = new Word(R.drawable.ic_launcher_background,"ばなな");

    LinearLayout container;
    TextView nameTextView;
    TextView nameTextView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                        //apple_icon
        container = (LinearLayout)findViewById(R.id.container);

        nameTextView = new TextView(getApplicationContext());
        nameTextView.setText(apple.name);
        nameTextView1.setText(banana.name);

        LinearLayout layout = new LinearLayout(this.getApplicationContext());
        layout.setOrientation(LinearLayout.HORIZONTAL);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(apple.resId);

        layout.addView(imageView);
        layout.addView(nameTextView);
        container.addView(layout);



        LinearLayout layout1 = new LinearLayout(this.getApplicationContext());
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        ImageView imageView1 = new ImageView(this);
        imageView1.setImageResource(banana.resId);

        layout1.addView(imageView1);
        layout.addView(nameTextView1);
        container.addView(layout1);


    }
}
