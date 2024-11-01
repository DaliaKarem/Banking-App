package com.example.bankingapp.View;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bankingapp.Model.OperationsClasses;
import com.example.bankingapp.R;
import com.example.bankingapp.View.Adapters.OperationAdapter;
import com.example.bankingapp.View.Fragments.FirstFragment;
import com.example.bankingapp.View.Fragments.FifthFragment;
import com.example.bankingapp.View.Fragments.FourthFragment;
import com.example.bankingapp.View.Fragments.SecondFragment;
import com.example.bankingapp.View.Fragments.ThirdFragment;
import com.example.bankingapp.databinding.ActivityHomeBinding;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Home extends AppCompatActivity {
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Bottom navigation setup
        binding.bottomNavigationView.setBackground(null);
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            if (item.getItemId() == R.id.Home) {
                selectedFragment = new FirstFragment();
            } else if (item.getItemId() == R.id.Wallet) {
                selectedFragment = new SecondFragment();
            } else if (item.getItemId() == R.id.Scan) {
                selectedFragment = new ThirdFragment();
            } else if (item.getItemId() == R.id.Card) {
                selectedFragment = new FourthFragment();
            } else if (item.getItemId() == R.id.Profile) {
                selectedFragment = new FifthFragment();
            }

            if (selectedFragment != null) {
                replaceFragment(selectedFragment);
            }
            return true;
        });
        replaceFragment(new FirstFragment());

    }
    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}
