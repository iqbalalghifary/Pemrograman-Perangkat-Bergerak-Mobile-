package com.ETS.Ikbal_Alghifary.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ETS.Ikbal_Alghifary.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DataKlub extends RecyclerView.Adapter<DataKlub.KlubViewHolder> {
    private List<Klub> listKlub = new ArrayList<>();

    public DataKlub(List<Klub>listKlub){
        this.listKlub=listKlub;
    }

    private KlubClickListener listener;

    public interface KlubClickListener {
        public void onClick(View view, int position);
    }

    public void setListener(KlubClickListener listener){
        this.listener=listener;
    }

    @NonNull
    @Override
    public KlubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View gun = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.listview_row,viewGroup,false);
        KlubViewHolder viewHolder = new KlubViewHolder(gun);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KlubViewHolder KlubViewHolder, int i) {
        Klub item=listKlub.get(i);
        KlubViewHolder.txtDesc.setText(item.getDesc());
        KlubViewHolder.txtName.setText(item.getName());
        KlubViewHolder.txtDetail.setText(item.getDetail());
        Picasso.get().load(item.getImageUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .into(KlubViewHolder.imageKlub);
    }

    @Override
    public int getItemCount() {
        return listKlub.size();
    }

    public class KlubViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageKlub;
        public TextView txtName,txtDesc,txtDetail;

        public KlubViewHolder(@NonNull View itemView){
            super(itemView);
            imageKlub=itemView.findViewById(R.id.imageKlub);
            txtName=itemView.findViewById(R.id.txtName);
            txtDesc=itemView.findViewById(R.id.txtDesc);
            txtDetail=itemView.findViewById(R.id.txtDetail);
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }
}