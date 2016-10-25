package com.example.gabrielhideki.aplicativoestresse;
public class Sentimento {
    String name;
    boolean value;

    Sentimento(String name, boolean value){
        this.name = name;
        this.value = value;
    }
    public String getName(){
        return this.name;
    }
    public boolean getValue(){
        return this.value;
    }
}
