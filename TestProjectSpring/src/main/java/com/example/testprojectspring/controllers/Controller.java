package com.example.testprojectspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("/")
    public String getString(){

        int i = 0;
        i++;
        return  "returned";
    }

    @GetMapping("/new")
    public List<Integer> getList(){
        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i<10;i++){
            integers.add(i);
        }
        return integers;
    }
}
