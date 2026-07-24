package com.barflow.backend.service;

import com.barflow.backend.dto.CocktailRequest;
import com.barflow.backend.dto.CocktailResponse;
import com.barflow.backend.entity.Cocktail;
import com.barflow.backend.exception.CocktailNotFoundException;
import com.barflow.backend.mapper.CocktailMapper;
import com.barflow.backend.repository.CocktailRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class CocktailService {
    private final CocktailRepository cocktailRepository;
    private CocktailMapper mapper;

    public CocktailService(CocktailRepository cocktailRepository, CocktailMapper mapper) {
        this.cocktailRepository = cocktailRepository;
        this.mapper = mapper;
    }
    public List<CocktailResponse> getAllCocktails() {
       return mapToResponseList(cocktailRepository.findAll());
    }
    public CocktailResponse getCocktailById(long id) {
       Cocktail cocktail = cocktailRepository.findById(id).orElseThrow(() -> new CocktailNotFoundException("Cocktail not found"));
       return mapper.toResponse(cocktail);
    }
    public CocktailResponse addCocktail(CocktailRequest request) {
       Cocktail cocktail = mapper.toEntity(request);
       Cocktail savedCocktail = cocktailRepository.save(cocktail);
       return mapper.toResponse(savedCocktail);
    }
    public CocktailResponse updateCocktail(long id, CocktailRequest request) {
        Cocktail cocktail = cocktailRepository.findById(id).orElseThrow(() -> new CocktailNotFoundException("Cocktail not found"));
        cocktail.setName(request.getName());
        cocktail.setInstructions(request.getInstructions());
        cocktail.setDescription(request.getDescription());
        cocktail.setImagineUrl(request.getImageUrl());
        Cocktail savedCocktail = cocktailRepository.save(cocktail);
        return mapper.toResponse(savedCocktail);
    }
    public void deleteCocktail(long id) {
       Cocktail cocktail = cocktailRepository.findById(id).orElseThrow(() -> new CocktailNotFoundException("Cocktail not found"));
       cocktailRepository.delete(cocktail);
    }
    public List<CocktailResponse> searchCocktail(String name) {
      return mapToResponseList(cocktailRepository.findByNameContainingIgnoreCase(name));
    }
    private List<CocktailResponse> mapToResponseList(List<Cocktail> cocktails) {
        List<CocktailResponse> responses = new ArrayList<>();
        for(Cocktail cocktail : cocktails) {
            CocktailResponse response = mapper.toResponse(cocktail);
            responses.add(response);
        }
        return responses;
    }
}
