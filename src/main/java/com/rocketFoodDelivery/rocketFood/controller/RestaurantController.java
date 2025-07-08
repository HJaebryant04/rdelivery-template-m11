package com.rocketFoodDelivery.rocketFood.controller;

import com.rocketFoodDelivery.rocketFood.models.Restaurant;
import com.rocketFoodDelivery.rocketFood.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backoffice/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantRepository repo;

    @GetMapping
    public List<Restaurant> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Restaurant getOne(@PathVariable Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Restaurant not found: " + id));
    }

    @PostMapping
    public Restaurant create(@RequestBody Restaurant r) {
        return repo.save(r);
    }

    @PutMapping("/{id}")
    public Restaurant update(@PathVariable Long id, @RequestBody Restaurant r) {
        r.setId(id);
        return repo.save(r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}