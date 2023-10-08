package com.acm.repostiory;

import com.acm.R;
import com.acm.model.BudGet;

import java.util.ArrayList;
import java.util.List;

public class BuGetRepostitory {

    public List<BudGet> getAllBudGets() {
        List<BudGet> budGets = new ArrayList<>();
        budGets.add(new BudGet(R.drawable.build, "Coca cola", 200.0));
        budGets.add(new BudGet(R.drawable.build, "MA Carvalho", 1200.0));
        budGets.add(new BudGet(R.drawable.build, "C|S o", 1000.0));
        budGets.add(new BudGet(R.drawable.build, "Oligartas", 1900.0));
        budGets.add(new BudGet(R.drawable.build, "Mariola", 2900.0));
        budGets.add(new BudGet(R.drawable.build, "MM&cia", 5900.0));
        budGets.add(new BudGet(R.drawable.build, "PMCG", 1900.0));
        budGets.add(new BudGet(R.drawable.build, "Fundação casa", 2900.0));
        return budGets;
    }
}
