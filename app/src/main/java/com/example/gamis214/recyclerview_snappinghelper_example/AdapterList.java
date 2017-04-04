package com.example.gamis214.recyclerview_snappinghelper_example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JAAH on 04/04/17.
 */

public class AdapterList extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private String[] lstStrings;

    public AdapterList(String[] lstStrings){
        this.lstStrings = lstStrings;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        itemViewHolder viewHolder = (itemViewHolder) holder;
        viewHolder.textView.setText(lstStrings[position]);
    }

    public static class itemViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public itemViewHolder(View itemView) {
            super(itemView);

            this.textView = (TextView) itemView.findViewById(R.id.txtTitle);
        }
    }

    @Override
    public int getItemCount() {
        return lstStrings.length;
    }
}
