package com.tnbproject.services;

import com.tnbproject.bean.Category;
import com.tnbproject.dao.CategoryDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryDao categoryDao;

    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    public <S extends Category> S save(S entity) {
        return categoryDao.save(entity);
    }

    public Optional<Category> findById(Long aLong) {
        return categoryDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        categoryDao.deleteById(aLong);
    }

    public void deleteAll() {
        categoryDao.deleteAll();
    }
    
    public void switchOnAll() {
    	
    }
    
  public void switchOffAll() {
    	
    }
    
}
