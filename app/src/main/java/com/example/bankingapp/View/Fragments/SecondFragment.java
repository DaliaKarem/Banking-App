package com.example.bankingapp.View.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bankingapp.R;


public class SecondFragment extends Fragment {

/*
Wallet:

Display the user's available balance.
Provide options to add money to the wallet or transfer funds to a bank account.
 */
    public  SecondFragment (){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}