package com.example.bankingapp.View.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bankingapp.R;


public class ThirdFragment extends Fragment {
/*
Scan:

A button with a "scan" icon to initiate QR code scanning for payments or transfers.
* */

    public  ThirdFragment (){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
}