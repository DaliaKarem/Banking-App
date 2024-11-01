package com.example.bankingapp.View.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bankingapp.R;


public class FifthFragment extends Fragment {

/**
 * My Profile:
 *
 * A button to access the user's profile information, including personal details, security settings, and notifications.
 */

    public  FifthFragment (){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }
}