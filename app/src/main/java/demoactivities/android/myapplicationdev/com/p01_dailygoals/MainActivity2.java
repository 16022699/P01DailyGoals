package demoactivities.android.myapplicationdev.com.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = (TextView) findViewById(R.id.textView3);
        // Display on the TextView
        tv1.setText(info[0] + " : " + info[1] + "\n" + info[2] + " : " + info[3] + "\n" + info[4] + " : " + info[5] + "\n" + "Reflection : " + info[6] );
    }
}
