package com.example.springrest.entities;

public class Entity {
    private String name;

    public Entity(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String name() {
        return this.name;
    }
    public static Entity createEntity(String name) {
        return switch (name) {
            case "rock" -> new Rock(name);
            case "paper" -> new Paper(name);
            case "scissors" -> new Scissors(name);
            default -> throw new IllegalArgumentException("Invalid entity name: " + name);
        };
    }
    public boolean beats(Entity other) {
        throw new UnsupportedOperationException("Not implemented yet ");
    }
}
