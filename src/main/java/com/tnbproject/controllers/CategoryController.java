package com.tnbproject.controllers;

import com.tnbproject.bean.Category;

import com.tnbproject.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value = "api/categories")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping(value = "/")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @PostMapping(value = "")
    public <S extends Category> S save(@RequestBody S entity) {
        return categoryService.save(entity);
    }

    @GetMapping(value = "id/{id}")
    public Optional<Category> findById(@PathVariable Long aLong) {
        return categoryService.findById(aLong);
    }

    @DeleteMapping(value = "id/{id}")
    public void deleteById(@PathVariable Long aLong) {
        categoryService.deleteById(aLong);
    }

    @DeleteMapping(value = "")
    public void deleteAll() {
        categoryService.deleteAll();
    }
}
