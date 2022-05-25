package sg.edu.rp.c346.id21018193.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    TextView tv13;
    TextView tv14;
    TextView tv15;
    TextView tv16;
    TextView tv17;
    TextView tv18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        tv13 = findViewById(R.id.textView13);
        tv14 = findViewById(R.id.textView14);
        tv15 = findViewById(R.id.textView15);
        tv16 = findViewById(R.id.textView16);
        tv17 = findViewById(R.id.textView17);
        tv18 = findViewById(R.id.textView18);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Module");
        tv13.setText("Module Code: " + questionsSelected);
        tv14.setText("Module name: " + questionsSelected);
        tv15.setText("Academic year: " + questionsSelected);
        tv16.setText("Semester: " + questionsSelected);
        tv17.setText("Modular Credit: " + questionsSelected);
        tv18.setText("Venue: " + questionsSelected);
    }
}