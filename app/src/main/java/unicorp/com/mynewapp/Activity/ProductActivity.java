package unicorp.com.mynewapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import unicorp.com.mynewapp.Models.ModelProduct;
import unicorp.com.mynewapp.Adapters.ProductAdapter;
import unicorp.com.mynewapp.R;

public class ProductActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ProductAdapter mAdapter;
    private List<ModelProduct>mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Initi();

        mList.add(new ModelProduct("Pizza","105","3","52",R.drawable.pizza));
        mList.add(new ModelProduct("Pizza","105","3","52",R.drawable.pizza));
        mList.add(new ModelProduct("Pizza","105","3","52",R.drawable.pizza));
        mAdapter.notifyDataSetChanged();
    }

    private void Initi(){
        mRecyclerView = findViewById(R.id.recycler_product);
        mRecyclerView.hasFixedSize();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mList = new ArrayList<>();
        mAdapter = new ProductAdapter(ProductActivity.this,mList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
