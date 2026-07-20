package com.barflow.backend.exception;

public class CocktailNotFoundException extends RuntimeException {
public CocktailNotFoundException(String massage) {
    super(massage);
}
}
