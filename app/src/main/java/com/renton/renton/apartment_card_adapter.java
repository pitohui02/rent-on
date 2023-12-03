package com.renton.renton;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class apartment_card_adapter extends RecyclerView.Adapter<apartment_card_adapter.MyViewHolder> {

    Context context;
    ArrayList<card_apartments> card_apartments;
    public apartment_card_adapter(Context context, ArrayList<card_apartments> card_apartments) {
        this.context = context;
        this.card_apartments = card_apartments;
    }
    @NonNull
    @Override
    public apartment_card_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rent_card, parent, false);

        return new apartment_card_adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull apartment_card_adapter.MyViewHolder holder, int position) {
        holder.rentName.setText(card_apartments.get(position).getRentName());
        holder.rentAddress.setText(card_apartments.get(position).getRentAddress());
        holder.rentPic.setImageResource(card_apartments.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return card_apartments.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView rentPic;
        TextView rentName, rentAddress;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            rentPic = itemView.findViewById(R.id.rentPic);
            rentName = itemView.findViewById(R.id.rentName);
            rentAddress = itemView.findViewById(R.id.rentAddress);
        }
    }
}
