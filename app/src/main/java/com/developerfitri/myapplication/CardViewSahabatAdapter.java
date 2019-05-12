package com.developerfitri.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewSahabatAdapter extends RecyclerView.Adapter<CardViewSahabatAdapter.CardViewHolder> {

    private ArrayList<Sahabat> listSahabat;
    private Context context;
    private Activity activity;

    public CardViewSahabatAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Sahabat> getListSahabat() {
        return listSahabat;
    }

    public void setListSahabat(ArrayList<Sahabat> listSahabat) {
        this.listSahabat = listSahabat;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_keluarga, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final Sahabat k = getListSahabat().get(position);
        Glide.with(context).load(k.getPhoto()).override(350,550).into(holder.imgPhoto);
        holder.tvname.setText(k.getName());
        holder.tvremarks.setText(k.getStatus());
        holder.sahabat = k;



        holder.btnsahre.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share " + getListSahabat().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));


    }

    @Override
    public int getItemCount() {
        return getListSahabat().size();
    }


    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
         ImageView imgPhoto;
         TextView tvname, tvremarks;
         Button btndetail, btnsahre;
         Sahabat sahabat;

        public CardViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvname = itemView.findViewById(R.id.tv_item_name);
            tvremarks = itemView.findViewById(R.id.tv_item_status);
            btnsahre = itemView.findViewById(R.id.btn_set_share);
            btndetail = itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, Detail.class);
            intent.putExtra("key", sahabat);
            context.startActivity(intent);
        }
    }
}
