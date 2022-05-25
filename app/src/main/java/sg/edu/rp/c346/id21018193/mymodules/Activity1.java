package sg.edu.rp.c346.id21018193.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView tvMod1;
    TextView tvMod2;
    TextView tvMod3;
    TextView tvMod4;
    EditText etMod1;
    EditText etMod2;
    EditText etMod3;
    EditText etMod4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        tvMod1 = findViewById(R.id.textViewMod1);
        tvMod2 = findViewById(R.id.textViewMod2);
        tvMod3 = findViewById(R.id.textViewMod3);
        tvMod4 = findViewById(R.id.textViewMod4);
        etMod1 = findViewById(R.id.editTextMod1);
        etMod2 = findViewById(R.id.editTextMod2);
        etMod3 = findViewById(R.id.editTextMod3);
        etMod4 = findViewById(R.id.editTextMod4);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Module");
        tvMod1.setText(questionsSelected + " is: " + etMod1);


    }
}