package com.example.foodappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Product> productList=new ArrayList<>();
    private LinearLayoutManager manager;
    private Product_Adapter product_adapter;

//    View name;
//    View description;
//    View price;
//    View image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        name = findViewById(R.id.tv_name);
//        description = findViewById(R.id.tv_desc);
//        productList = findViewById(R.id.recyclerview);
//        price = findViewById(R.id.tv_price);
//        image = findViewById(R.id.img_product);


        Utils.changeStatusBarAndNavigationBarColor(MainActivity.this, R.color.mirage, R.color.mirage_dark);

        recyclerView = findViewById(R.id.recyclerview);
        setProduct_adapter();
    }


    private void setProduct_adapter() {


        productList.add(new Product("Pizza",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "5 $",
                "https://cdn.pixabay.com/photo/2014/09/24/00/36/pizza-458400__340.png"));
        productList.add(new Product("Breakfast",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "5 $",
                "https://cdn.pixabay.com/photo/2016/03/31/20/54/bacon-1296080_960_720.png"));
        productList.add(new Product("Steak",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "5 $",
                "https://cdn.pixabay.com/photo/2013/07/13/09/38/barbecue-155844__340.png"));
        productList.add(new Product("Sandwhich",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "5 $",
                "https://cdn.pixabay.com/photo/2013/07/13/09/37/sandwich-155786__340.png"));
        productList.add(new Product("Tea",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "5 $",
                "https://cdn.pixabay.com/photo/2013/07/13/09/51/drink-156158__340.png"));
        productList.add(new Product("Hot Dogs",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "5 $",
                "https://cdn.pixabay.com/photo/2014/04/02/11/02/hot-305302__340.png"));
        productList.add(new Product("Donut",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "5 $",
                "https://cdn.pixabay.com/photo/2017/01/31/14/25/chocolate-2024546__340.png"));
        productList.add(new Product("Burger",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "5 $",
                "https://cdn.pixabay.com/photo/2012/04/13/01/51/hamburger-31775__340.png"));




        product_adapter = new Product_Adapter(MainActivity.this, productList);
        recyclerView.setAdapter(product_adapter);
        manager = new LinearLayoutManager(MainActivity.this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);

    }
}