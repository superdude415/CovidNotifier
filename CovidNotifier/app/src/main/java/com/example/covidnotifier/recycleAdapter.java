package com.example.covidnotifier;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycleAdapter extends RecyclerView.Adapter<recycleAdapter.recycleViewHolder>{

    String data1[], data2[];
    Context context;

    public recycleAdapter(Context ct, String sl[], String s2[]){
        data1 = sl;
        data2 = s2;
        context = ct;
    }

    @NonNull
    @Override
    public recycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rows, parent,false);
        return new recycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recycleViewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class recycleViewHolder extends RecyclerView.ViewHolder{

        TextView text1, text2;

        public recycleViewHolder(@NonNull View itemView){
            super(itemView);
            text1 = itemView.findViewById(R.id.text);
            text2 = itemView.findViewById(R.id.text2);}
    }

}
