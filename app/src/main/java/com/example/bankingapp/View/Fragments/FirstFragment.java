package com.example.bankingapp.View.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bankingapp.Const.Consts;
import com.example.bankingapp.Model.OperationsClasses;
import com.example.bankingapp.Model.userOperations;
import com.example.bankingapp.R;
import com.example.bankingapp.View.Adapters.OperationAdapter;
import com.example.bankingapp.View.Adapters.userOperationsAdapter;
import com.example.bankingapp.databinding.FragmentFirstBinding;

import java.util.Arrays;
import java.util.List;
/*
Send Money: A button with a "send" icon or the word "Send" to initiate money transfers.
My Card: A button with a credit card icon to access card details, transactions, and security settings.
More: A button with a "more" icon or the word "More" to access additional features like account statements, customer support, and settings.
* */

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding; // Change the name according to your binding class
    private OperationAdapter operationAdapter;
    private userOperationsAdapter userOperationsAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false); // Correctly inflate the binding
        View view = binding.getRoot();

        // Initialize the RecyclerView
        Consts oprationsIcon=new Consts();
        List<OperationsClasses> operationsClassesList=oprationsIcon.getOperationsClassesList();
        List<userOperations> userOperationsList=oprationsIcon.getUserOperationsList();

        binding.iconsAdaptersHome.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        operationAdapter = new OperationAdapter(operationsClassesList,getContext());
        binding.iconsAdaptersHome.setAdapter(operationAdapter);

        binding.histroyOperations.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        userOperationsAdapter=new userOperationsAdapter(userOperationsList);
        binding.histroyOperations.setAdapter(userOperationsAdapter);

        return view;// Return the inflated view
    }
}
