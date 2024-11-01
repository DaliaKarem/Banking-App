package com.example.bankingapp.View.Adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bankingapp.Model.OperationsClasses;
import com.example.bankingapp.R;
import com.example.bankingapp.View.Fragments.FourthFragment;
import com.example.bankingapp.View.Fragments.SecondFragment;
import com.example.bankingapp.View.Home;

import java.util.List;
public class OperationAdapter extends RecyclerView.Adapter<OperationAdapter.MyViewHolder> {
    private List<OperationsClasses> operationsList;
    private Context context;
    public OperationAdapter(List<OperationsClasses> operationsList,Context conext) {
        this.operationsList = operationsList;
        this.context=conext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_operation, parent, false); // Inflate your item layout
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        OperationsClasses operation = operationsList.get(position);
        holder.operationName.setText(operation.getName());
        holder.operationImage.setImageResource(operation.getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (context instanceof Home && operation.getName()=="card") { // Make sure your context is an instance of your activity
                    Home mainActivity = (Home) context;
                    mainActivity.replaceFragment(new FourthFragment()); // Call a method to replace the fragment
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return operationsList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView operationImage;
        TextView operationName;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.cardIcon);
            operationImage = itemView.findViewById(R.id.operation_image);
            operationName = itemView.findViewById(R.id.operation_name);
        }        }

    }
