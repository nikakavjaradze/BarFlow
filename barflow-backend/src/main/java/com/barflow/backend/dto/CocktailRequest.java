package com.barflow.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CocktailRequest {
    @NotBlank(message = "Name can not be blank")
    @Size(min = 2, max = 50, message = "Name must contain 2 to 50 characters")
    private String name;
    @Size(max = 200, message = "Description must contain maximum 200 characters")
    private String description;
    @NotBlank(message = "Instructions can not be blank")
    @Size(min = 10, max = 200, message = "Instructions must contain 10 to 200 characters")
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
