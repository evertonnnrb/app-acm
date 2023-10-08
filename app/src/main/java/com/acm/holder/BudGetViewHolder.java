package com.acm.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.acm.R;

public class BudGetViewHolder extends RecyclerView.ViewHolder {
    private LinearLayoutCompat linearLayoutCompat;
    private TextView textViewName;
    private TextView textViewContractValue;

    public LinearLayoutCompat getLinearLayoutCompat() {
        return linearLayoutCompat;
    }

    public void setLinearLayoutCompat(LinearLayoutCompat linearLayoutCompat) {
        this.linearLayoutCompat = linearLayoutCompat;
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(TextView textViewName) {
        this.textViewName = textViewName;
    }

    public TextView getTextViewContractValue() {
        return textViewContractValue;
    }

    public void setTextViewContractValue(TextView textViewContractValue) {
        this.textViewContractValue = textViewContractValue;
    }

    public BudGetViewHolder(@NonNull View itemView) {
        super(itemView);
        this.linearLayoutCompat = itemView.findViewById(R.id.linearLayoutCompatItem);
        this.textViewName = itemView.findViewById(R.id.txtViewTxtItem);
        this.textViewContractValue = itemView.findViewById(R.id.txtViewContractValueItem);
    }
}
