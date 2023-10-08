package com.acm.model;

public class BudGet {
    private int logo;
    private String name;
    private Double contractValue;

    public BudGet() {
    }

    public BudGet(int logo, String name, Double contractValue) {
        this.logo = logo;
        this.name = name;
        this.contractValue = contractValue;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public void setContractValue(Double contractValue) {
        this.contractValue = contractValue;
    }
}
