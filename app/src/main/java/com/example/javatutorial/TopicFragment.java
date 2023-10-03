package com.example.javatutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TopicFragment extends Fragment implements TopicListner{

    ArrayList<TopicModel> arr;
    RecyclerView recyclerView;
    Activity context;
    public TopicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_topic, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arr=new ArrayList<>();
        recyclerView = context.findViewById(R.id.topicrecycleview);
        setdata();
        //setAdapter();
        RecycleTopicAdapter adapter = new RecycleTopicAdapter(getContext(), arr,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }

    void setdata(){
        arr.add(new TopicModel("hghsvc","bvsvcgvgxv"));
        arr.add(new TopicModel("djjbcuj","ncjudbuc"));
        arr.add(new TopicModel("bchjbdhc","ncjdbjc"));
        arr.add(new TopicModel("ncjdbc","ncidcjdbcjhd"));
        arr.add(new TopicModel("cjbdhcbhd","ncjhdbhc"));


        Log.i("array","all data enter");
    }

    public void onItemClick(TopicModel tm) {
        Intent intent = new Intent(context,TopicActivity.class);
        intent.putExtra("Name",tm.name);
        intent.putExtra("description",tm.description);
        //Toast.makeText(this,tm.name,Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}