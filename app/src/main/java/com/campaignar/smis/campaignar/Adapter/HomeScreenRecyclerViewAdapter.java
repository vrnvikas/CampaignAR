package com.campaignar.smis.campaignar.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.campaignar.smis.campaignar.Activity.KnowYourCandidate;
import com.campaignar.smis.campaignar.Activity.VideoGallery;
import com.campaignar.smis.campaignar.Activity.YourInterests;
import com.campaignar.smis.campaignar.R;

/**
 * Created by Vikas Kumar on 29-09-2016.
 */

public class HomeScreenRecyclerViewAdapter extends
        RecyclerView.Adapter<HomeScreenRecyclerViewAdapter.HomeScreenViewHolder> {

    private Context mContext;
    private String[] data;
    public HomeScreenRecyclerViewAdapter(Context context, String[] list){
        mContext = context;
        data = list;
    }

    @Override
    public HomeScreenViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.home_screen_custom_row, parent, false);

        // Return a new holder instance
        HomeScreenViewHolder viewHolder = new HomeScreenViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HomeScreenViewHolder holder, int position) {

        holder.textView.setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    private Context getContext() {
        return mContext;
    }

    public class HomeScreenViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ImageView imageViewOne,imageViewTwo;


        public HomeScreenViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.row_textView);
            imageViewOne = (ImageView) itemView.findViewById(R.id.row_image_view);
            imageViewTwo = (ImageView) itemView.findViewById(R.id.row_image_view_rightArrow);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(getPosition());

                }
            });

        }

        private void startActivity(int position) {
            switch (position){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    getContext().startActivity(new Intent(getContext(), YourInterests.class));
                    break;
                case 3:
                    getContext().startActivity(new Intent(getContext(), KnowYourCandidate.class));
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    getContext().startActivity(new Intent(getContext(), VideoGallery.class));
                    break;
            }
        }
    }
}
