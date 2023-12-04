package com.tnbproject.dao;

import com.tnbproject.bean.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Categorie,Long> {
}
