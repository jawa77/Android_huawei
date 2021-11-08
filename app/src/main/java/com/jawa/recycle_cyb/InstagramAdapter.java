package com.jawa.recycle_cyb;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.InstagramViewHolder>{

    private ArrayList<cardvieww> mInstagramlist;

    public static class InstagramViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView text;

        public InstagramViewHolder(@NonNull View itemView){
            super(itemView);

            imageView=itemView.findViewById(R.id.imgview);
            text=itemView.findViewById(R.id.textview);
        }
    }
    public InstagramAdapter(ArrayList<cardvieww> instagramList){
        mInstagramlist=instagramList;

    }

    @NonNull
    @Override
    public InstagramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        InstagramViewHolder instagramViewHolder=new InstagramViewHolder(view);
        return instagramViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull InstagramViewHolder instagramViewHolder, int i) {
        cardvieww currenitem =mInstagramlist.get(i);
        instagramViewHolder.imageView.setImageResource(currenitem.getMyimageSource());
        instagramViewHolder.text.setText(currenitem.getText());

    }

    @Override
    public int getItemCount() {
        return mInstagramlist.size();
    }


}
