package com.example.bankingapp.Const;

import com.example.bankingapp.Model.OperationsClasses;
import com.example.bankingapp.Model.userOperations;
import com.example.bankingapp.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consts {
    private List<OperationsClasses> operationsClassesList;
    private List<userOperations> userOperationsList;
    public Consts() {
        // Initialize the list in the constructor
        operationsClassesList = new ArrayList<>();
        userOperationsList=new ArrayList<>();
        initializeOperationsClasses();
        initializeUserClasses();
    }

    private void initializeUserClasses() {
        userOperationsList.add(new userOperations("Ahmed Mohamed",R.drawable.send,"+2000000",1050));
        userOperationsList.add(new userOperations("Hussien Sayed",R.drawable.send,"+2554851",50));
        userOperationsList.add(new userOperations("Magdy Mohamed",R.drawable.receive,"+21552555",10000));
        userOperationsList.add(new userOperations("Ahmed Hosssam",R.drawable.send,"+488255252",500000));

    }

    public List<OperationsClasses> getOperationsClassesList() {
        return operationsClassesList;
    }

    public List<userOperations> getUserOperationsList() {
        return userOperationsList;
    }

    private void initializeOperationsClasses() {
        // Add items to the operationsClassesList
        operationsClassesList.add(new OperationsClasses("send", R.drawable.send));
        operationsClassesList.add(new OperationsClasses("card", R.drawable.baseline_add_card_24));
        operationsClassesList.add(new OperationsClasses("more", R.drawable.more));
    }
}
