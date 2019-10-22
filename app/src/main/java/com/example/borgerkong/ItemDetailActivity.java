package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();
        final int itemId = intent.getIntExtra("itemID", 0);

        TextView name = findViewById(R.id.name);
        TextView price = findViewById(R.id.price);
        TextView description = findViewById(R.id.item_description);
        ImageView itemImg = findViewById(R.id.item_img);

        final FoodItem currItem = FakeDatabase.getItemById(itemId);
        name.setText(currItem.getItemName());
        price.setText(currItem.getPriceS());
        description.setText(currItem.getDescription());
        itemImg.setImageResource(currItem.getImageId());

        final NumberPicker np = findViewById(R.id.amount_picker);

        np.setMinValue(0);
        np.setMaxValue(10);

        Button add = findViewById(R.id.add_btn);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int currNum = currItem.getNumInOrder();
                currItem.setNumInOrder(currNum + np.getValue());

                String message = "Added " + np.getValue() + " " + currItem.getItemName() + "(s) to your order!";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

    }

}
