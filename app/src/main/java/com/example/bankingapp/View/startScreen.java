package com.example.bankingapp.View;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.hbb20.CountryCodePicker;
import com.example.bankingapp.R;

public class startScreen extends AppCompatActivity {

    CountryCodePicker countryCodePicker;
    EditText text;
    Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscreen);

        countryCodePicker = findViewById(R.id.countyCodePicker);
        text = findViewById(R.id.EditText_phone);
        enterButton = findViewById(R.id.enter_button); // Initialize the enter button

        // Set a listener for country code change if needed
        countryCodePicker.setOnCountryChangeListener(() -> {
            String countryName = countryCodePicker.getSelectedCountryName();
            String countryCode = countryCodePicker.getSelectedCountryCode();
            String countryCodeName = countryCodePicker.getSelectedCountryNameCode();
            String countryCodeWithPlus = countryCodePicker.getSelectedCountryCodeWithPlus();

            Toast.makeText(this, countryName + ", " + countryCode + ", " + countryCodeName + ", " + countryCodeWithPlus, Toast.LENGTH_SHORT).show();
        });

        // Set OnClickListener for the enter button to check if phone number is not empty and navigate
        enterButton.setOnClickListener(v -> {
            if (!text.getText().toString().isEmpty()) {
                Intent intent = new Intent(getApplicationContext(), VerificationCode.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Please enter your phone number", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

