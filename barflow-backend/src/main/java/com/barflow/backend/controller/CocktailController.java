package com.barflow.backend.controller;

import com.barflow.backend.entity.Cocktail;
import com.barflow.backend.service.CocktailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cocktails")
public class CocktailController {

    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }
    @GetMapping
    public List<Cocktail> getCocktails() {
        return cocktailService.getAllCocktails();
    }
    @GetMapping("/{id}")
    public Cocktail getCocktailById(@PathVariable long id) {
        return cocktailService.getCocktailById(id);
    }
    @PostMapping
    public Cocktail addCocktail (@RequestBody Cocktail cocktail) {
        return cocktailService.addCocktail(cocktail);
    }
    @PutMapping("/{id}")
    public Cocktail updateCocktail (@PathVariable long id, @RequestBody Cocktail cocktail) {
        return cocktailService.updateCocktail(cocktail);
    }
    @DeleteMapping("/{id}")
    public void deleteCocktail(@PathVariable long id) {
        cocktailService.deleteCocktail(id);
    }
}
