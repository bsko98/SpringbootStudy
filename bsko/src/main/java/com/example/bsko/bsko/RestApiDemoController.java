package com.example.bsko.bsko;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/")
public class RestApiDemoController {
    private List<Coffee> coffees = new ArrayList<>();

    public RestApiDemoController(){
        coffees.addAll(List.of(
            new Coffee("Café Cereza"),
            new Coffee("Café Ganador"),
            new Coffee("abc","Latte")
        ));
    }

    @GetMapping("/coffees")
        List<Coffee> getCoffees(){
            return coffees;
        }

    @GetMapping("/{id}")
    String getCoffeeById(@PathVariable("id") String id) {
        return id;
    }
    
    
}
