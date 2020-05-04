package com.company;

public class Guitar extends MusicalInstrament {
    private int amountOfStrings;
    private String type;

    public int getAmountOfStrings() {
        return amountOfStrings;
    }

    public void setAmountOfStrings(int amountOfStrings) {
        this.amountOfStrings = amountOfStrings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Guitar(int amountOfStrings, String type) {
        this.amountOfStrings = amountOfStrings;
        this.type = type;
    }
}
