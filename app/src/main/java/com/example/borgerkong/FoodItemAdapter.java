package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder> {
    private ArrayList<FoodItem> mDataset;

    public class FoodItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView item_img;
        public TextView name;
        public TextView price;

        public FoodItemViewHolder(View v) {
            super(v);
            view = v;
            item_img = v.findViewById(R.id.item_img);
            name = v.findViewById(R.id.name);
            price = v.findViewById(R.id.price);
        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public FoodItemAdapter(ArrayList<FoodItem> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public FoodItemAdapter.FoodItemViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {


        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_item, parent, false);

        FoodItemViewHolder food_item_vh = new FoodItemViewHolder(view);
        return food_item_vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(FoodItemViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final FoodItem foodItemAtPosition = mDataset.get(position);

        holder.item_img.setImageResource(foodItemAtPosition.getImageId());
        holder.item_img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra("itemID", foodItemAtPosition.getItemId());
                context.startActivity(intent);
            }
        });
        holder.name.setText(foodItemAtPosition.getItemName());
        holder.price.setText(foodItemAtPosition.getPriceS());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
