package com.example.android.submission2_1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListTvShowAdapter extends RecyclerView.Adapter<ListTvShowAdapter.ListViewHolder> {

    private ArrayList<TvShow> listTvShow;

    public ListTvShowAdapter(ArrayList<TvShow> list){
        this.listTvShow = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_tvshow, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final TvShow tvShow = listTvShow.get(position);

        Glide.with(holder.itemView.getContext())
                .load(tvShow.getPhoto())
                .apply(new RequestOptions().override(240, 240))
                .into(holder.imgPhoto);
        holder.tvName.setText(tvShow.getName());
        holder.tvDuration.setText(tvShow.getDuration());
        holder.tvRating.setText(tvShow.getRating());

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DescTvShowAct.class);

                intent.putExtra("photo", tvShow.getPhoto());
                intent.putExtra("name", tvShow.getName());
                intent.putExtra("rating", tvShow.getRating());
                intent.putExtra("duration", tvShow.getDuration());
                intent.putExtra("desc", tvShow.getDesc());

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listTvShow.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDuration, tvRating, tvDesc;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvshow_name);
            tvDuration = itemView.findViewById(R.id.tvshow_duration);
            imgPhoto = itemView.findViewById(R.id.photo_tvshow);
            tvRating = itemView.findViewById(R.id.tvshow_rating);
        }
    }
}
