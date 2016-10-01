package com.campaignar.smis.campaignar.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.campaignar.smis.campaignar.Activity.YourInterestsDetail;
import com.campaignar.smis.campaignar.R;

/**
 * Created by Vikas Kumar on 30-09-2016.
 */

public class YourInterestsRecyclerViewAdapter extends
        RecyclerView.Adapter<YourInterestsRecyclerViewAdapter.YourInterestsViewHolder> {

    private FragmentActivity mContext;

    public YourInterestsRecyclerViewAdapter(FragmentActivity context){
        mContext = context;
    }

    @Override
    public YourInterestsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.custom_row_your_interests, parent, false);

        // Return a new holder instance
        YourInterestsViewHolder viewHolder = new YourInterestsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(YourInterestsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    private Context getContext() {
        return mContext;
    }

    public class YourInterestsViewHolder extends RecyclerView.ViewHolder {
        public YourInterestsViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getContext().startActivity(new Intent(getContext(), YourInterestsDetail.class));
                }
            });
        }
    }
}
