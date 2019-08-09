package com.example.android.submission2_1;

import android.content.Context;
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

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.ListViewHolder> {

    private ArrayList<Movie> listMovie;


    public ListMovieAdapter(ArrayList<Movie> list){
        this.listMovie = list;
    }

    public ArrayList<Movie> getListMovie() {
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_movie, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Movie movie = listMovie.get(position);

        Glide.with(holder.itemView.getContext())
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(240, 240))
                .into(holder.imgPhoto);
        holder.tvName.setText(movie.getName());
        holder.tvDuration.setText(movie.getDuration());
        holder.tvRating.setText(movie.getRating());

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DescMovieAct.class);

                intent.putExtra("photo", movie.getPhoto());
                intent.putExtra("name", movie.getName());
                intent.putExtra("rating", movie.getRating());
                intent.putExtra("duration", movie.getDuration());
                intent.putExtra("desc", movie.getDesc());

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDuration, tvRating, tvDesc;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.movie_name);
            tvDuration = itemView.findViewById(R.id.movie_duration);
            imgPhoto = itemView.findViewById(R.id.photo_movie);
            tvRating = itemView.findViewById(R.id.movie_rating);

        }
    }
}
