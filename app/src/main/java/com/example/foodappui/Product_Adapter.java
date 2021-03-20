package com.example.foodappui;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.material.tabs.TabItem;

import org.w3c.dom.Text;

import java.util.List;

public class Product_Adapter extends RecyclerView.Adapter<Product_Adapter.ProductViewHolder> {
    private List<Product> productlist;
    private Context context;
    public Product_Adapter( Context context,List<Product> productlist) {
        this.context = context;
        this.productlist = productlist;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.cart_product,null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {



        Product product=productlist.get(position);




        Glide.with(context)
                .load(product.getImage())
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(holder.img_product);
        holder.tv_name.setText(product.getName());
        holder.tv_desc.setText(product.getDesc());
        holder.tv_price.setText(product.getPrice());
    }

    @Override
    public int getItemCount() {
        return productlist.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name,tv_price,tv_desc;
        ImageView img_add,img_product;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.tv_name);
            tv_desc=itemView.findViewById(R.id.tv_desc);
            tv_price=itemView.findViewById(R.id.tv_price);
            img_add=itemView.findViewById(R.id.img_add);
            img_product=itemView.findViewById(R.id.img_product);




        }
    }

}
