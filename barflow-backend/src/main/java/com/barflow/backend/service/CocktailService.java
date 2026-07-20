package com.barflow.backend.service;

import com.barflow.backend.entity.Cocktail;
import com.barflow.backend.exception.CocktailNotFoundException;
import com.barflow.backend.repository.CocktailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    private final CocktailRepository cocktailRepository;

    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }
    public List<Cocktail> getAllCocktails() {
        return cocktailRepository.findAll();
    }
    public Cocktail getCocktailById(long id) {
       return cocktailRepository.findById(id).orElseThrow(() -> new CocktailNotFoundException("Cocktail not found"));
    }
    public Cocktail addCocktail(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }
    public Cocktail updateCocktail(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }
    public void deleteCocktail(long id) {
        cocktailRepository.deleteById(id);
    }
}
