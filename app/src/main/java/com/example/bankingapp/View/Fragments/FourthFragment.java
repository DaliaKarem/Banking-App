package com.example.bankingapp.View.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bankingapp.R;


public class FourthFragment extends Fragment {
/*
* My Card:

A button to access the same card details as on the homepage.
* */

    public  FourthFragment (){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }
}
