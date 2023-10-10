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

public class CodeFragment extends Fragment implements CodeLister {
    ArrayList<CodeModel> arr;
    RecyclerView recyclerView;
    Activity context;
    public CodeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_code, container, false);
        return root;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arr=new ArrayList<>();
        recyclerView = context.findViewById(R.id.coderecycleview);
        setdata();
        //setAdapter();
        RecycleCodeAdapter adapter = new RecycleCodeAdapter(getContext(), arr,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }

    void setdata(){
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        arr.add(new CodeModel("Array","Code","Output"));
        Log.i("array","all data enter");
    }

    @Override
    public void onItemClick(CodeModel tm) {
        Intent intent = new Intent(context,CodeActivity.class);
        intent.putExtra("Name",tm.name);
        intent.putExtra("description",tm.description);
        intent.putExtra("code",tm.output);
        //Toast.makeText(this,tm.name,Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}