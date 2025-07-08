package com.rocketFoodDelivery.rocketFood.models;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @Column
    private String email;

    @Column(name = "price_range", nullable = false)
    private int priceRange = 1;

    @Column(nullable = false)
    private boolean active = true;

    public Restaurant() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getPriceRange() { return priceRange; }
    public void setPriceRange(int priceRange) { this.priceRange = priceRange; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}