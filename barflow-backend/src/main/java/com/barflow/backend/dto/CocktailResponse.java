package com.barflow.backend.dto;

public class CocktailResponse {
    private Long id;
    private String name;
    private String description;
    private String instruction;
    private String imageUrl;

    public CocktailResponse() {}

    public CocktailResponse(long id, String name, String description, String instruction, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.instruction = instruction;
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
    public String getInstruction() {
        return instruction;
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
