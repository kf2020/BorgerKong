package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ArrayList<FoodItem> order = FakeDatabase.getItemsInOrder();

        RecyclerView recyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager layoutManager;

        recyclerView = findViewById(R.id.food_item_recycler_view);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        mAdapter = new OrderedFoodItemAdapter(order);
        recyclerView.setAdapter(mAdapter);

        Button total = findViewById(R.id.total);
        String payBtnText = "Total $" + String.format("%.2f",FakeDatabase.getTotalOrderPrice());
        total.setText(payBtnText);
    }
}
