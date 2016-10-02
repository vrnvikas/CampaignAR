package com.campaignar.smis.campaignar.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.campaignar.smis.campaignar.Activity.KnowYourCandidateDetail;
import com.campaignar.smis.campaignar.Fragments.FragmentKnowYourCandidate;
import com.campaignar.smis.campaignar.R;
import com.mikhaellopez.circularimageview.CircularImageView;

/**
 * Created by Vikas Kumar on 01-10-2016.
 */

public class KnowYourCandidateRecyclerViewAdapter extends
        RecyclerView.Adapter<KnowYourCandidateRecyclerViewAdapter.KnowYourCandidateViewHolder> {

    private final FragmentKnowYourCandidate.OnFragmentInteractionListener listener;
    private Context mContext;

    public KnowYourCandidateRecyclerViewAdapter(Context context, FragmentKnowYourCandidate.OnFragmentInteractionListener mListener) {
        mContext = context;
        listener = mListener;
    }

    @Override
    public KnowYourCandidateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.custom_row_know_your_candidate, parent, false);

        // Return a new holder instance
        KnowYourCandidateViewHolder viewHolder = new KnowYourCandidateViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(KnowYourCandidateViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 3;
    }

    private Context getContext() {
        return mContext;
    }

    public class KnowYourCandidateViewHolder extends RecyclerView.ViewHolder {

        TextView tvState,tvPrevious,tvName,tvPosition;
        CircularImageView candidateImageView;

        public KnowYourCandidateViewHolder(View itemView) {
            super(itemView);

            tvState = (TextView) itemView.findViewById(R.id.tvState);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvPosition = (TextView) itemView.findViewById(R.id.tvPosition);
            candidateImageView = (CircularImageView) itemView.findViewById(R.id.cvProfile);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getContext().startActivity(new Intent(getContext(), KnowYourCandidateDetail.class));
                }
            });

        }
    }
}
