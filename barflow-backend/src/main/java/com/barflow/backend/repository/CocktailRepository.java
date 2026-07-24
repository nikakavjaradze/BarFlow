package com.barflow.backend.repository;

import com.barflow.backend.entity.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {

    List<Cocktail> findByNameContainingIgnoreCase(String name);
}
