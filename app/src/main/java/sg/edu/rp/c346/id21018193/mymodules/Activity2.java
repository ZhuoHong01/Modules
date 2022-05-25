package sg.edu.rp.c346.id21018193.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
        tv6 = findViewById(R.id.textView6);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Module");
        tv1.setText("Module Code: " + questionsSelected);
        tv2.setText("Module name: " + questionsSelected);
        tv3.setText("Academic year: " + questionsSelected);
        tv4.setText("Semester: " + questionsSelected);
        tv5.setText("Modular Credit: " + questionsSelected);
        tv6.setText("Venue: " + questionsSelected);
    }
}