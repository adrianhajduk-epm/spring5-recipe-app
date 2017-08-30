package com.example.app.repositories;

import com.example.app.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by PLADHAJ on 2017-08-29.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
