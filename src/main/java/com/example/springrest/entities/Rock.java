package com.example.springrest.entities;

public class Rock extends Entity{
    public Rock(String name){
        super(name);
    }
    public boolean beats(Entity other) {
        return other instanceof Scissors;
    }
}
