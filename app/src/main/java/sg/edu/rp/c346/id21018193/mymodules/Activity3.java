package sg.edu.rp.c346.id21018193.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;
    TextView tv11;
    TextView tv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        tv7 = findViewById(R.id.textView);
        tv8 = findViewById(R.id.textView2);
        tv9 = findViewById(R.id.textView3);
        tv10 = findViewById(R.id.textView4);
        tv11 = findViewById(R.id.textView5);
        tv12 = findViewById(R.id.textView6);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Module");
        tv7.setText("Module Code: " + questionsSelected);
        tv8.setText("Module name: " + questionsSelected);
        tv9.setText("Academic year: " + questionsSelected);
        tv10.setText("Semester: " + questionsSelected);
        tv11.setText("Modular Credit: " + questionsSelected);
        tv12.setText("Venue: " + questionsSelected);
    }
}