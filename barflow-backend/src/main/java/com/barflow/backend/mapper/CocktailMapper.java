package com.barflow.backend.mapper;

import com.barflow.backend.dto.CocktailRequest;
import com.barflow.backend.dto.CocktailResponse;
import com.barflow.backend.entity.Cocktail;
import org.springframework.stereotype.Component;

@Component
public class CocktailMapper {

    public Cocktail toEntity(CocktailRequest request){
        return new Cocktail(request.getName(), request.getDescription(), request.getInstructions(), request.getImageUrl());
    }
    public CocktailResponse toResponse(Cocktail cocktail) {
        return new CocktailResponse(cocktail.getId(), cocktail.getName(), cocktail.getDescription(), cocktail.getInstructions(), cocktail.getImagineUrl());
    }
}
