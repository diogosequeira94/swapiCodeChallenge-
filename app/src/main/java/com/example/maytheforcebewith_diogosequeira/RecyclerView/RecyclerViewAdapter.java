package com.example.maytheforcebewith_diogosequeira.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maytheforcebewith_diogosequeira.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private ArrayList<PeopleItem> peopleList;

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        public ImageView icon;
        public TextView mTextView1;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
        }
    }

    public RecyclerViewAdapter(ArrayList<PeopleItem> itemList){
        peopleList = itemList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.people_item, parent, false );
        RecyclerViewHolder evh = new RecyclerViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        PeopleItem currentItem = peopleList.get(position);

        holder.icon.setImageResource(currentItem.getIcon());
        holder.mTextView1.setText(currentItem.getName());
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }
}
