package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnimalFact {

    @JsonProperty("text")
    private String text;




    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }




    @Override
    public String toString() {
        return "AnimalFact  " +
                ", text= " + text ;
    }



}
