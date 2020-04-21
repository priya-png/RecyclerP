package com.example.recyclerapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{

    private MyListData[] listdata;

    // RecyclerView recyclerView;
    public MyListAdapter(MyListData[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final MyListData myListData = listdata[position];
        holder.nameTextView.setText(listdata[position].getName());
        holder.imageView.setImageResource(listdata[position].getImg());;
        holder.paymentTextView.setText(listdata[position].getPayment());
        holder.weeklyTextView.setText(listdata[position].getWeeklyText());

        holder.rsTextView.setText(listdata[position].getRsText());

    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView nameTextView;
        public TextView paymentTextView;
        public TextView weeklyTextView;
        public TextView rsTextView;

        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageIcon);
            this.nameTextView = (TextView) itemView.findViewById(R.id.nameText);
            this.paymentTextView = (TextView) itemView.findViewById(R.id.paymentText);
            this.weeklyTextView = (TextView) itemView.findViewById(R.id.weeklyText);
            this.rsTextView = (TextView) itemView.findViewById(R.id.rsText);
            // relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }

    }

}