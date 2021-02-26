package com.example.demo.dto;

public class SearchTxInfo {
    private String txName;
    private String txNumber;

    public SearchTxInfo(String txName, String txNumber) {
        this.txName = txName;
        this.txNumber = txNumber;
    }

    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName;
    }

    public String getTxNumber() {
        return txNumber;
    }

    public void setTxNumber(String txNumber) {
        this.txNumber = txNumber;
    }
}
