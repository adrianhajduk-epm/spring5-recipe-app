package com.example.app.services;

import com.example.app.model.Recipe;
import com.example.app.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by PLADHAJ on 2017-08-31.
 */
public class RecipeServiceImpTest {

  private RecipeServiceImp recipeService;

  @Mock
  RecipeRepository recipeRepository;


  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    recipeService = new RecipeServiceImp(recipeRepository);
  }


  @Test
  public void getRecipes() throws Exception {

    Recipe recipe = new Recipe();
    HashSet recipesDate = new HashSet();
    recipesDate.add(recipe);

    when(recipeService.getRecipes()).thenReturn(recipesDate);

    Set<Recipe> recipes = recipeService.getRecipes();
    assertEquals(recipes.size(), 1);
    verify(recipeRepository, times(1)).findAll();
  }

}
