package com.renton.renton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class main_screen extends AppCompatActivity {

    ArrayList<card_apartments> card_apartments = new ArrayList<>();

    int[] imageArray = {R.drawable.taft};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        RecyclerView card_apartment = (RecyclerView) findViewById(R.id.apartment_card);

        setupCard();

        apartment_card_adapter adapter = new apartment_card_adapter(this, card_apartments);
        card_apartment.setAdapter(adapter);
        card_apartment.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setupCard(){
        String[] rentNames = getResources().getStringArray(R.array.rent_name_text);
        String[] rentAddress = getResources().getStringArray(R.array.rent_address_text);

        for(int i = 0; i < rentNames.length; i++) {
           card_apartments.add(new card_apartments(rentNames[i], rentAddress[i], imageArray[i]));
        }
    }
}