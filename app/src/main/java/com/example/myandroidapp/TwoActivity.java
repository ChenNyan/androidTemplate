package com.example.myandroidapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class TwoActivity extends Activity {
    public class Product {
        private int id;
        private String name;
        private double price;

        public Product(String name, double price, int id){
            this.name = name;
            this.price = price;
            this.id = id;
        }

        public String getName() {
            return name;
        };

        public double getPrice() {
            return price;
        };
        public int getId(){
            return id;
        }
        // 可能还有其他属性，如图片URL、描述等

        // 构造函数、getter和setter方法
    }

    public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
        private List<Product> products;

        private Context context;

        public ProductAdapter(List<Product> products, Context context) {
            this.products = products;
            this.context = context;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.product_item, parent, false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

            Product product = products.get(position);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 在这里处理点击事件，可以通过position或者product对象来确定是哪个元素被点击了
                    Toast.makeText(context, "你点击了商品：" + product.getId(), Toast.LENGTH_SHORT).show();
                }
            });
            holder.bind(product);
        }

        @Override
        public int getItemCount() {
            return products.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            // 定义你的视图元素，如TextViews, ImageViews等
            TextView nameTextView;
            TextView priceTextView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                nameTextView = itemView.findViewById(R.id.nameTextView);
                priceTextView = itemView.findViewById(R.id.priceTextView);
            }

            public void bind(Product product) {
                nameTextView.setText(product.getName());
                priceTextView.setText(String.valueOf(product.getPrice()));
            }
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        ListView listView = findViewById(R.id.my_list_view);
        String[] items = {"aaa","aaa","aaa","aaa"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        List<Product> products = new ArrayList<>();
        products.add(new Product("商品1", 9.99, 1));
        products.add(new Product("商品2", 9.99, 2));
        products.add(new Product("商品2", 9.99, 3));
        products.add(new Product("商品2", 9.99, 4));
        products.add(new Product("商品2", 9.99, 5));
        products.add(new Product("商品2", 9.99, 6));
        products.add(new Product("商品2", 9.99, 7));
        products.add(new Product("商品2", 9.99, 8));
        products.add(new Product("商品2", 9.99, 9));
        products.add(new Product("商品2", 9.99, 10));
        products.add(new Product("商品2", 9.99, 11));
        products.add(new Product("商品2", 9.99, 12));
        products.add(new Product("商品2", 9.99, 13));
        products.add(new Product("商品2", 9.99, 14));
        products.add(new Product("商品2", 9.99, 15));
        products.add(new Product("商品2", 9.99, 16));
        products.add(new Product("商品2", 9.99, 17));
        products.add(new Product("商品2", 9.99, 18));
        products.add(new Product("商品2", 9.99, 19));
        products.add(new Product("商品2", 9.99, 20));
        products.add(new Product("商品2", 9.99, 21));
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ProductAdapter adaptera = new ProductAdapter(products, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adaptera);
    }

    public void back (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
