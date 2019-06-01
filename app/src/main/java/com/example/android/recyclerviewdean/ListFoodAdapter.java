package com.example.android.recyclerviewdean;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Food> listFood;

    public ListFoodAdapter(Context context) {
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
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_food, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        final Food p = getListFood().get(position);

        categoryViewHolder.tvName.setText(getListFood().get(position).getName());
        categoryViewHolder.tvRanking.setText(getListFood().get(position).getRanking());
        Glide.with(context)
                .load(getListFood().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.imgPhoto.setOnClickListener(new View.OnClickListener() {


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

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRanking;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRanking = itemView.findViewById(R.id.tv_item_ranking);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
