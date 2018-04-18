package demoactivities.android.myapplicationdev.com.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button) findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                //Get the RadioGroup object
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);

                //Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId = rg.getCheckedRadioButtonId();
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();

                //Get the radio button object from the Id we had gotten above
                RadioButton rb = (RadioButton)findViewById(selectedButtonId);
                RadioButton rb2 = (RadioButton)findViewById(selectedButtonId2);
                RadioButton rb3 = (RadioButton)findViewById(selectedButtonId3);


                //Get the TextView
                TextView tvQns1 = (TextView) findViewById(R.id.textView);
                TextView tvQns2 = (TextView) findViewById(R.id.textView9);
                TextView tvQns3 = (TextView) findViewById(R.id.textView11);

                //Get the Id of the editText
                EditText etName = (EditText) findViewById(R.id.editText);

                //Put the name and age into an array
                String[] info = {tvQns1.getText().toString(), rb.getText().toString(), tvQns2.getText().toString(), rb.getText().toString(), tvQns3.getText().toString(), rb3.getText().toString(), etName.getText().toString() };
                // Create an intent to start another activity called
                // DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                //Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                //Start the new activity
                startActivity(i);
            }
        });
    }
}
