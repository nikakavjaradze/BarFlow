package com.barflow.backend.dto;

public class CocktailRequest {
    private String name;
    private String description;
    private String instructions;
    private String imageUrl;

    public CocktailRequest() {}

    public CocktailRequest(String name, String description, String instructions, String imageUrl) {
        this.name = name;
        this.description = description;
        this.instructions = instructions;
        this.imageUrl = imageUrl;
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
    public String getImageUrl() {
        return imageUrl;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
