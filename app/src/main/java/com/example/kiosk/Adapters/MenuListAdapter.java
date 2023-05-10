package com.example.kiosk.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kiosk.Data.Menu.ShopMenuItem;
import com.example.kiosk.OrderSummaryActivity;
import com.example.kiosk.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.MyViewHolder> {

    Context context;
    List<ShopMenuItem> data;


    public MenuListAdapter(Context context, List<ShopMenuItem> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.menu_list_items, parent, false);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Picasso.get().load(data.get(position).getImage()).placeholder(R.drawable.img_card).into(holder.image);
        holder.dish_name.setText(data.get(position).getName());
        holder.amount.setText("RM " + data.get(position).getBasePrice().getDineIn().toString());
//            Log.d("hello usfjksdfjksdf", singleUnit.getName() + " " + singleUnit.getImage() + " " + singleUnit.getBasePrice().getDineIn());
        holder.dish_name.setText(data.get(position).getName());
        holder.amount.setText("RM" + data.get(position).getBasePrice().getDineIn().toString());

        ////////////////
        holder.add_to_card.setOnClickListener(v -> {
            // add to cart waali api lgegi yha and intent nhi khulega
            if(holder.add_to_card.getText().toString().equalsIgnoreCase("Add To Cart"))
            {
                holder.add_to_card.setText("added");
            }
            else {
                holder.add_to_card.setText("Add To Cart");
            }

//            int itemId = data.get(position).getItemId();
//            int shopId = data.get(position).getShopId();
//            Intent i = new Intent(context, OrderSummaryActivity.class);
//            i.putExtra("itemId", itemId);
//            i.putExtra("shopId", shopId);
//            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        if (data != null) {
            return data.size();
        } else {
            return 0;
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView dish_name, amount, add_to_card;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            dish_name = itemView.findViewById(R.id.dish_name);
            amount = itemView.findViewById(R.id.amount);
            add_to_card = itemView.findViewById(R.id.add_to_card);
        }
    }
}