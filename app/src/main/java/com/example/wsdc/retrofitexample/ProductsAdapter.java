package com.example.wsdc.retrofitexample;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wsdc.retrofitexample.models.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder> {
    Context context;
    ArrayList<Product> data;
    LayoutInflater layoutInflater;
    public ProductsAdapter(Context context, ArrayList<Product> data){
        this.context = context;
        this.data = data;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.product_card, parent, false);
        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {
        Product product = data.get(position);
        holder.name.setText(product.getName());
        holder.price.setText(product.getPrice() + "");
        holder.vendor.setText(product.getVendors().get(0).getVendor().getFirstName());
        Picasso.get()
                .load("http://104.238.93.161:9090/game_image/" + product.getImagePath())
                .centerCrop()
                .fit()
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ProductsViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView price;
        TextView vendor;
        ImageView imageView;

        public ProductsViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            vendor = itemView.findViewById(R.id.vendor);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
