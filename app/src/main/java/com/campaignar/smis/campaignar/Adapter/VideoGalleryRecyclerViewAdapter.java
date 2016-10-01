package com.campaignar.smis.campaignar.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.campaignar.smis.campaignar.Activity.YouTubePlayerActivity;
import com.campaignar.smis.campaignar.R;

/**
 * Created by Vikas Kumar on 30-09-2016.
 */

public class VideoGalleryRecyclerViewAdapter extends
        RecyclerView.Adapter<VideoGalleryRecyclerViewAdapter.VideoGalleryViewHolder> {

    private Context mContext;

    public VideoGalleryRecyclerViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public VideoGalleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.custom_row_video_gallery, parent, false);

        // Return a new holder instance
        VideoGalleryViewHolder viewHolder = new VideoGalleryViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VideoGalleryViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    private Context getContext() {
        return mContext;
    }

    public class VideoGalleryViewHolder extends RecyclerView.ViewHolder {


        public VideoGalleryViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getContext().startActivity(new Intent(getContext(), YouTubePlayerActivity.class));
                }
            });


        }
    }
}
