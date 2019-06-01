package com.example.android.recyclerviewdean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DescFoodAct extends AppCompatActivity {

    ImageView img;
    TextView nameText, rankingText, descText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_food);

        Intent intent = getIntent();

        final String name = intent.getExtras ( ).getString ( "name" );
        final String pos = intent.getExtras ( ).getString ( "ranking" );
        final String photo = intent.getExtras ( ).getString ( "photo" );
        final String desc = intent.getExtras ( ).getString ( "desc" );


        img = findViewById ( R.id.img_item_photo );
        nameText = findViewById ( R.id.tv_item_name );
        rankingText = findViewById ( R.id.tv_item_ranking );
        descText = findViewById ( R.id.tv_bahan1 );


        Glide.with(this).load(photo).into(img);
        nameText.setText(name);
        rankingText.setText(pos);
        descText.setText (desc);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Detail Makanan");
        }
    }
}
