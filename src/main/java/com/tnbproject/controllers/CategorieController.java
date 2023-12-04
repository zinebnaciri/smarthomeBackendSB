package com.tnbproject.controllers;

import com.tnbproject.bean.Categorie;
import com.tnbproject.services.CategorieService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/controller/categorie")
@CrossOrigin
public class CategorieController {


    @Autowired
    private CategorieService categorieService;

    @GetMapping("/")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @PostMapping("/")
    public Categorie save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }


    @GetMapping("/id/{id}")
    public Optional<Categorie> findById(@PathVariable Long id) {
        return categorieService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }


    


}