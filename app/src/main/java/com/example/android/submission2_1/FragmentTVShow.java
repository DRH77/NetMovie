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

public class FragmentTVShow extends Fragment {
    View view;
    private RecyclerView rvTvShow;
    private ArrayList<TvShow> list = new ArrayList<>();

    public FragmentTVShow() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tvshow_fragment, container, false);

        rvTvShow = view.findViewById(R.id.rv_tvshow);
        rvTvShow.setHasFixedSize(true);

        list.addAll(TVShowData.getListData());
        showRecyclerList();
        return view;
    }

    private void showRecyclerList(){
        rvTvShow.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListTvShowAdapter listTvShowAdapter = new ListTvShowAdapter(list);
        rvTvShow.setAdapter(listTvShowAdapter);
    }
}
