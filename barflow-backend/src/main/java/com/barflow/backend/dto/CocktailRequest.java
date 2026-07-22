package com.barflow.backend.dto;

public class CocktailRequest {
    private String name;
    private String description;
    private String instruction;
    private String imageUrl;

    public CocktailRequest() {}

    public CocktailRequest(String name, String description, String instruction, String imageUrl) {
        this.name = name;
        this.description = description;
        this.instruction = instruction;
        this.imageUrl = imageUrl;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getInstruction() {
        return instruction;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
