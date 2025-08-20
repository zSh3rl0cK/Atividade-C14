package org.example;

public class Pokemon {
    String name;
    String type;


    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String mostraInfo(){
        return name + " " + type;
    }
}
