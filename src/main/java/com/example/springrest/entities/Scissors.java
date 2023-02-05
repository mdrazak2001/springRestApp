package com.example.springrest.entities;

public class Scissors extends Entity{
    public Scissors(String name){
        super(name);
    }
    public boolean beats(Entity other) {
        return other instanceof Paper;
    }
}
