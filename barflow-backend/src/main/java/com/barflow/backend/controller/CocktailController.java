package com.barflow.backend.controller;

import com.barflow.backend.dto.CocktailRequest;
import com.barflow.backend.dto.CocktailResponse;
import com.barflow.backend.mapper.CocktailMapper;
import com.barflow.backend.service.CocktailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cocktails")
public class CocktailController {

    private final CocktailService cocktailService;
    private CocktailMapper mapper;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }
    @GetMapping
    public List<CocktailResponse> getCocktails() {
        return cocktailService.getAllCocktails();
    }
    @GetMapping("/{id}")
    public CocktailResponse getCocktailById(@PathVariable long id) {
        return cocktailService.getCocktailById(id);
    }
    @PostMapping
    public CocktailResponse addCocktail (@RequestBody CocktailRequest request) {
        return cocktailService.addCocktail(request);
    }
    @PutMapping("/{id}")
    public CocktailResponse updateCocktail (@PathVariable long id, @RequestBody CocktailRequest request) {
        return cocktailService.updateCocktail(id, request);
    }
    @DeleteMapping("/{id}")
    public void deleteCocktail(@PathVariable long id) {
        cocktailService.deleteCocktail(id);
    }
}
