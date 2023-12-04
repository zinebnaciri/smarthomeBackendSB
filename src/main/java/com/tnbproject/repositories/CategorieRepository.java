package com.tnbproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnbproject.bean.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
