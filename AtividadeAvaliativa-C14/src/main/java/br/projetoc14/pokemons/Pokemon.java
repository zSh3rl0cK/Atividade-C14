package br.projetoc14.pokemons;

import java.util.List;

public class Pokemon {
    private String name;
    private List<TypeSlot> types;
    private List<StatInfo> stats;

    public String mostraInfo() {
        return name + " (" + getFirstType() + ") HP: " + getHp();
    }

    // --- Classes internas para mapear os objetos aninhados da API ---
    public static class TypeSlot {
        private int slot;
        private Type type;

        public Type getType() { return type; }
    }

    public static class Type {
        private String name;

        public String getName() { return name; }
    }

    public static class StatInfo {
        private int base_stat;
        private Stat stat;

        public int getBase_stat() { return base_stat; }
        public Stat getStat() { return stat; }
    }

    public static class Stat {
        private String name;

        public String getName() { return name; }
    }

    // --- Getters úteis ---
    public String getName() {
        return name;
    }

    public String getFirstType() {
        if (types != null && !types.isEmpty()) {
            return types.get(0).getType().getName();
        }
        return "desconhecido";
    }

    public int getHp() {
        if (stats != null) {
            for (StatInfo s : stats) {
                if (s.getStat().getName().equals("hp")) {
                    return s.getBase_stat();
                }
            }
        }
        return -1; // caso não ache
    }

    public void setHp(int hp) {
    }
}
