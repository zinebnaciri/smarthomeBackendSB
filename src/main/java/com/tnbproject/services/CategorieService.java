package com.tnbproject.services;

import com.tnbproject.bean.Categorie;
import com.tnbproject.dao.CategoryDao;
import com.tnbproject.repositories.CategorieRepository;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }

    public Categorie  save (Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    public Optional<Categorie> findById(Long id) {
        return categorieRepository.findById(id);
    }

    public void deleteById(Long id) {
        categorieRepository.deleteById(id);
    }

 

}