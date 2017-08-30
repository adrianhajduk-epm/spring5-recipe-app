package com.example.app.controllers;

import com.example.app.model.Category;
import com.example.app.model.UnitOfMeasure;
import com.example.app.repositories.CategoryRepository;
import com.example.app.repositories.UnitOfMeasureRepository;
import com.example.app.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by PLADHAJ on 2017-08-28.
 */
@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
