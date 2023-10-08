package com.acm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.acm.R;
import com.acm.holder.BudGetViewHolder;
import com.acm.model.BudGet;

import java.util.List;

public class AdapterBudGet extends RecyclerView.Adapter<BudGetViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<BudGet> budGetList;

    public AdapterBudGet(Context context, List<BudGet> budGetList) {
        this.context = context;
        this.layoutInflater = layoutInflater.from(context);
        this.budGetList = budGetList;
    }

    @NonNull
    @Override
    public BudGetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = this.layoutInflater.inflate(R.layout.rv_item,parent,false);
        return new BudGetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BudGetViewHolder holder, int position) {
        BudGet budGet = budGetList.get(position);
        holder.getTextViewName().setText(budGet.getName());
        holder.getTextViewContractValue().setText("R$ "+String.format("%,2f",budGet.getContractValue()));

    }

    @Override
    public int getItemCount() {
        return budGetList.size();
    }

    public void updateAdapter(List<BudGet> budGetList){
        this.budGetList.clear();
        this.budGetList.addAll(budGetList);
        notifyDataSetChanged();
    }

}
