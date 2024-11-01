package com.example.bankingapp.View;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bankingapp.R;

public class VerificationCode extends AppCompatActivity {
    private EditText etDigit1, etDigit2, etDigit3, etDigit4, etDigit5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);
        etDigit1 = findViewById(R.id.et_digit1);
        etDigit2 = findViewById(R.id.et_digit2);
        etDigit3 = findViewById(R.id.et_digit3);
        etDigit4 = findViewById(R.id.et_digit4);
        etDigit5 = findViewById(R.id.et_digit5);

        setupEditTextNavigation();

        etDigit5.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if (isCodeComplete()) {
                    navigateToNextActivity();
                }
            }
            // Unused methods
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });

    }

    private void setupEditTextNavigation() {
        etDigit1.addTextChangedListener(new MoveNextTextWatcher(etDigit2));
        etDigit2.addTextChangedListener(new MoveNextTextWatcher(etDigit3));
        etDigit3.addTextChangedListener(new MoveNextTextWatcher(etDigit4));
        etDigit4.addTextChangedListener(new MoveNextTextWatcher(etDigit5));
    }
    private boolean isCodeComplete() {
        return !etDigit1.getText().toString().isEmpty() &&
                !etDigit2.getText().toString().isEmpty() &&
                !etDigit3.getText().toString().isEmpty() &&
                !etDigit4.getText().toString().isEmpty() &&
                !etDigit5.getText().toString().isEmpty();
    }

    private void navigateToNextActivity() {
        Intent intent = new Intent(VerificationCode.this, Login.class);
        startActivity(intent);
        finish(); // Close the VerificationCode activity
    }
    private class MoveNextTextWatcher implements TextWatcher {
        private EditText nextEditText;

        public MoveNextTextWatcher(EditText nextEditText) {
            this.nextEditText = nextEditText;
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.length() == 1) {
                nextEditText.requestFocus();
            }
        }
        // Unused methods
        @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
        @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}
    }
}