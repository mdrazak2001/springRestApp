package com.example.springrest.controller;
import com.example.springrest.entities.*;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class MyController {
    // Home Page
    @GetMapping("/")
    public String home(){
        return "Welcome to Rock, Paper and Scissors Game!\nTo play with computer post => /play?move={rock/paper/scissors}";
    }

    @RequestMapping(value = "/play", method = RequestMethod.POST)
    public Map<String, String> post(@RequestParam(value = "move", defaultValue = "") String userMove) {
        Map<String, String> map = new LinkedHashMap<>();
        String computerMove = getComputerMove();
        Entity userEntity;
        try {
            userEntity = Entity.createEntity(userMove.toLowerCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid entity name");
        }

        Entity compEntity = Entity.createEntity(computerMove.toLowerCase());
        String result = Result.getResult(userEntity, compEntity);
        map.put("playerMove", userEntity.name());
        map.put("computerMove", compEntity.name());
        map.put("result", result);
        return map;
    }

    private static String getComputerMove() {
        String[] moves = {"Rock", "Paper","Scissors"};
        return moves[(int) (Math.random() * moves.length)];
    }

}
