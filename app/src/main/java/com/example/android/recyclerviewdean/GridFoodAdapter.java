package com.example.android.recyclerviewdean;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridFoodAdapter extends RecyclerView.Adapter<GridFoodAdapter.GridViewHolder> {

    private ArrayList<Food> listFood;
    private Context context;

    public GridFoodAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Food> getListFood() {
        return listFood;
    }

    public void setListFood(ArrayList<Food> listFood) {
        this.listFood = listFood;
    }



    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_food, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        final Food p = getListFood().get(position);

        Glide.with(context)
                .load(getListFood().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DescFoodAct.class);

                intent.putExtra("photo", p.getPhoto());
                intent.putExtra("name", p.getName());
                intent.putExtra("ranking", p.getRanking());
                intent.putExtra("desc", p.getDesc ());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListFood().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;


        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
