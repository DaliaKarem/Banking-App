package com.example.bankingapp.View.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bankingapp.Model.OperationsClasses;
import com.example.bankingapp.Model.userOperations;
import com.example.bankingapp.R;

import java.util.List;

public class userOperationsAdapter extends RecyclerView.Adapter<userOperationsAdapter.MyViewHolder> {
    private List<userOperations> userOperationsList;

    public userOperationsAdapter(List<userOperations> userOperationsList) {
        this.userOperationsList = userOperationsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_history_operations, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        userOperations operation = userOperationsList.get(position);
        holder.userName.setText(operation.getName());
        holder.userPhone.setText(operation.getPhone());
        holder.userMoney.setText(String.valueOf(operation.getMoney()));
        holder.userTime.setText(operation.getTime());

        holder.userIcon.setImageResource(operation.getIcon());
    }

    @Override
    public int getItemCount() {
        return userOperationsList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView userName, userPhone, userMoney, userTime;
        ImageView userIcon;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.userName);
            userPhone = itemView.findViewById(R.id.userPhone);
            userMoney = itemView.findViewById(R.id.userMoney);
            userTime = itemView.findViewById(R.id.userTime);
            userIcon = itemView.findViewById(R.id.userIcon);
        }
    }
}
