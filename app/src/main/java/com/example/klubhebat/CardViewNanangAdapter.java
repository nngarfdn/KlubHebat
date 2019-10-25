package com.example.klubhebat;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewNanangAdapter extends RecyclerView.Adapter<CardViewNanangAdapter.CardViewHolder> {

    private ArrayList<Nanang>listNanang;
    private Context context;
    private Activity activity;

    public CardViewNanangAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Nanang> getListNanang() {
        return listNanang;
    }

    public void setListNanang(ArrayList<Nanang> listNanang) {
        this.listNanang = listNanang;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_nanang, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final Nanang k = getListNanang().get(position);
        Glide.with(context)
                .load(k.getPhoto())
                        .into(holder.imgPhoto);
        holder.tvname.setText(k.getName());
        holder.tvremarks.setText(k.getRemarks());
        holder.nanang = k;



        holder.btnsahre.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Kamu menyukai klub "+getListNanang().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));


    }

    @Override
    public int getItemCount() {
        return getListNanang().size();
    }

    public void startactivity(Intent intent){

    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvname, tvremarks;
        Button btndetail, btnsahre;
        Nanang nanang;

        public CardViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvname = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvremarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnsahre = (Button)itemView.findViewById(R.id.btn_set_suka);
            btndetail = (Button)itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailNanangActivity.class);
            intent.putExtra("key", nanang);
            context.startActivity(intent);
        }
    }
}
