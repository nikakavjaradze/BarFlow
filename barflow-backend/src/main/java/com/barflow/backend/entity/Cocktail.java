package com.barflow.backend.entity;

import jakarta.persistence.*;

@Entity
public class Cocktail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String instructions;
    private String imagineUrl;

    public Cocktail() {}

public Cocktail(String name, String description,String instructions, String imageUrl) {
    this.name = name;
    this.description = description;
    this.instructions = instructions;
    this.imagineUrl = imageUrl;
}
public Long getId() {
    return id;
}
public String getName() {
    return name;
}
public String getDescription() {
    return description;
}
public String getInstructions() {
    return instructions;
}
public String getImagineUrl() {
    return imagineUrl;
}
public void setName(String name) {
        this.name = name;
}
public void setDescription(String description) {
        this.description = description;
}
public void setInstructions(String instructions) {
        this.instructions = instructions;
}
public void setImagineUrl(String imagineUrl) {
        this.imagineUrl = imagineUrl;
}
}
