package com.barflow.backend.dto;

public class CocktailResponse {
    private Long id;
    private String name;
    private String description;
    private String instructions;
    private String imageUrl;

    public CocktailResponse() {}

    public CocktailResponse(long id, String name, String description, String instructions, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.instructions = instructions;
        this.imageUrl = imageUrl;
    }
    public long getId() {
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
    public String getImageUrl() {
        return imageUrl;
    }
    public void setId(long id) {
        this.id = id;
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
