package com.example.kiosk.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kiosk.Data.CategoryData;
import com.example.kiosk.Fragments.MenuFragment;
import com.example.kiosk.R;
import com.example.kiosk.Room.DatabaseHelper;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    DatabaseHelper databaseHelper;
    Context context;
    List<CategoryData> data;

    public CategoryAdapter(Context context, List<CategoryData> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.category_cardview, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        CategoryData singleUnit = data.get(position);
        holder.product_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MenuFragment menuFragment = new MenuFragment(databaseHelper,context);
                Bundle bundle = new Bundle();
                bundle.putInt("Id", singleUnit.getId());
                menuFragment.setArguments(bundle);
                FragmentManager manager = ((AppCompatActivity) context).getSupportFragmentManager();
                FragmentTransaction Ft = manager.beginTransaction();
                Ft.addToBackStack(null);
                Ft.replace(R.id.container, menuFragment);

                Ft.commit();
            }
        });

        holder.product_name.setText(data.get(position).getName());
        Picasso.get().load(data.get(position).getImage()).placeholder(R.drawable.img_non).into(holder.product_img);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView product_name;
        ImageView product_img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            product_img = itemView.findViewById(R.id.product_img);
            product_name = itemView.findViewById(R.id.product_name);
        }
    }
}
