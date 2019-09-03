package com.wisn.nestedscrolll.comm;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wisn on 2019-09-02 17:57.
 */
public class ComAdapter extends RecyclerView.Adapter<ComAdapter.ViewHolder> {

    List<String> data;

    public ComAdapter() {
        data = new ArrayList<>();
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public void setTestData() {
        for (int i = 0; i < 100; i++) {
            this.data.add("test" + i);
        }
    }

    @NonNull
    @Override
    public ComAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      TextView textView=  new TextView(parent.getContext());
        textView.setHeight(100);
        return new ViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(@NonNull ComAdapter.ViewHolder holder, int position) {
        TextView textView = (TextView) holder.itemView;
        textView.setText(position + " " + data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
