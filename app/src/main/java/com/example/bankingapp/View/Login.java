package com.example.bankingapp.View;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bankingapp.Functions.Validation;
import com.example.bankingapp.R;
public class Login extends AppCompatActivity {
    EditText name, email, pass, confirmPass;
    Button btn;
    Validation validation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        confirmPass = findViewById(R.id.Confirmpass);
        btn = findViewById(R.id.login_btn);

        // Initialize Validation
        validation = new Validation();

        // Set onClick listener for button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate fields
                if (validation.name_Val(name.getText().toString()) &&
                        validation.email_Val(email.getText().toString()) &&
                        validation.pass_Val(pass.getText().toString()) &&
                        validation.Confirmpass_Val(pass.getText().toString(), confirmPass.getText().toString())) {

                    Log.d("LoginActivity", "Validation successful, proceeding to Home");
                    Intent intent = new Intent(getApplicationContext(), Home.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "Please check your inputs", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
