package com.example.javatutorial;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleCodeAdapter extends RecyclerView.Adapter<RecycleCodeAdapter.ViewHolder>{
    private ArrayList<CodeModel> array;
    private Context context;
    private TopicListner listner;
    int count=1;
    public RecycleCodeAdapter(@NonNull Context context, @NonNull ArrayList<CodeModel> arr, CodeListner listner){
        this.context=context;
        this.array=arr;
        this.listner=listner;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView topicname;
        private TextView topicindex;
        private TextView topicdes;
        private CardView relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            topicname  = itemView.findViewById(R.id.topicname);
            topicindex= itemView.findViewById(R.id.topicindex);
            topicdes = itemView.findViewById(R.id.topicdes);
            relativeLayout = itemView.findViewById(R.id.topiccard);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.topic_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        String name=array.get(position).getName();
        holder.topicname.setText(name);
        holder.topicindex.setText(Integer.toString(count));
        count++;
        holder.topicdes.setText(array.get(position).description);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                listner.onItemClick(array.get(position));
            }
        });
    }


    @Override
    public int getItemCount() {
        return array.size();
    }

}
