package com.example.bankingapp.Functions;

public class Validation {
    public boolean email_Val(String email) {
        return !email.isEmpty() && email.contains("@gmail.com");
    }

    public boolean name_Val(String name) {
        return !name.isEmpty();
    }

    public boolean pass_Val(String pass) {
        return !pass.isEmpty() && pass.length() >= 7;
    }

    public boolean Confirmpass_Val(String pass, String confirm) {
        return confirm.equals(pass);
    }
}
