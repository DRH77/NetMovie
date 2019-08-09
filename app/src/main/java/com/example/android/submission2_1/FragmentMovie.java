package com.example.android.submission2_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentMovie extends Fragment {
    View view;
    private RecyclerView rvMovie;
    private ArrayList<Movie> list = new ArrayList<>();

    public FragmentMovie() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.movie_fragment, container, false);

        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecyclerList();
        return view;
    }

    private void showRecyclerList(){
        rvMovie.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(list);
        rvMovie.setAdapter(listMovieAdapter);
    }
}
