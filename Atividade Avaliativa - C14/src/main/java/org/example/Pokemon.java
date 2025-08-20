package org.example;

public class Pokemon {

    private String name;
    private String type;
    private int hp;

    public Pokemon(String name, String type,  int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public String mostraInfo(){
        return name + " " + type + " " + hp;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
