package com.example.springrest.entities;

public class Result {



    public static String getResult(Entity user, Entity computer) {
        if(user.name().equals(computer.name())) {
            return "It is a tie!";
        } else if (user.beats(computer)) {
            return "Player wins!";
        } else if (computer.beats(user)){
            return "Computer wins!";
        }
        throw new IllegalArgumentException("Invalid entity name/names");
    }
}
