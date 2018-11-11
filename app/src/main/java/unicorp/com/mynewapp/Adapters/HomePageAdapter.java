package unicorp.com.mynewapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import unicorp.com.mynewapp.Activity.DetailsProducts;
import unicorp.com.mynewapp.Activity.ProductActivity;
import unicorp.com.mynewapp.Models.ModelProduct;
import unicorp.com.mynewapp.R;

/**
 * Created by Hima on 11/5/2018.
 */

public class HomePageAdapter extends RecyclerView.Adapter<HomePageAdapter.ViewHolder>  {
    Context context;
    List<Integer> mList;

    public HomePageAdapter(Context context, List<Integer> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_homepage,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //ModelProduct currentPosition = mList.get(position);
        Picasso.with(context).load(mList.get(position)).fit().into(holder.mImgView);
        //holder.mRatingBar.setRating(Float.valueOf(currentPosition.getRatePercent()));

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ProductActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View mView;
        private ImageView mImgView;
        private TextView mTitle,mRatingCount,mPrice;
        private RatingBar mRatingBar;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mImgView = mView.findViewById(R.id.Banner_Img);
        }
    }
}
