package sg.edu.rp.c346.id21018193.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    TextView tv19;
    TextView tv20;
    TextView tv21;
    TextView tv22;
    TextView tv23;
    TextView tv24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        tv19 = findViewById(R.id.textView19);
        tv20 = findViewById(R.id.textView20);
        tv21 = findViewById(R.id.textView21);
        tv22 = findViewById(R.id.textView22);
        tv23 = findViewById(R.id.textView23);
        tv24 = findViewById(R.id.textView24);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Module");
        tv19.setText("Module Code: " + questionsSelected);
        tv20.setText("Module name: " + questionsSelected);
        tv21.setText("Academic year: " + questionsSelected);
        tv22.setText("Semester: " + questionsSelected);
        tv23.setText("Modular Credit: " + questionsSelected);
        tv24.setText("Venue: " + questionsSelected);
    }
}