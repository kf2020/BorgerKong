package com.example.borgerkong;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderedFoodItemAdapter extends RecyclerView.Adapter<OrderedFoodItemAdapter.OrderedFoodItemViewHolder> {
    private ArrayList<FoodItem> mDataset;

    public class OrderedFoodItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView item_img;
        public TextView name;
        public TextView price;
        public TextView num_ordered;

        public OrderedFoodItemViewHolder(View v) {
            super(v);
            view = v;
            item_img = v.findViewById(R.id.item_img);
            name = v.findViewById(R.id.name);
            price = v.findViewById(R.id.price);
            num_ordered = v.findViewById(R.id.num_ordered);
        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public OrderedFoodItemAdapter(ArrayList<FoodItem> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public OrderedFoodItemAdapter.OrderedFoodItemViewHolder onCreateViewHolder(ViewGroup parent,
                                                                 int viewType) {


        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ordered_food_item, parent, false);

        OrderedFoodItemViewHolder food_item_vh = new OrderedFoodItemViewHolder(view);
        return food_item_vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(OrderedFoodItemViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final FoodItem foodItemAtPosition = mDataset.get(position);
        int amt = foodItemAtPosition.getNumInOrder();
        holder.name.setText(foodItemAtPosition.getItemName());

        double totalPrice = amt * foodItemAtPosition.getNumericPrice();
        holder.price.setText("A$" + String.format("%.2f", totalPrice));

        String numOrdered = "Amt: "+ amt;
        holder.num_ordered.setText(numOrdered);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
