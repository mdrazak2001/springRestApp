package com.example.springrest.entities;

public class Paper extends Entity{
    public Paper(String name){
        super(name);
    }
    public boolean beats(Entity other) {
        return other instanceof Rock;
    }
}
