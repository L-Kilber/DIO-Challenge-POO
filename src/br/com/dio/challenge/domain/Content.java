package br.com.dio.challenge.domain;

public abstract class Content {
    //Classes abstratas não podem ser instanciadas.
    protected static final double STANDARD_XP = 10d;

    private String name;
    private String description;

    public abstract double calculateXP();
    //O método abstrato exige implementação nas classes filhas.


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
