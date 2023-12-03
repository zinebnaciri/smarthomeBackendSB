package com.tnbproject.services;

import com.tnbproject.bean.Appareil;
import com.tnbproject.dao.AppareilDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AppareilService {

    private AppareilDao appareilDao;

    public List<Appareil> findAll() {
        return appareilDao.findAll();
    }

    public <S extends Appareil> S save(S entity) {
        return appareilDao.save(entity);
    }

    public Optional<Appareil> findById(Long aLong) {
        return appareilDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        appareilDao.deleteById(aLong);
    }

    public void deleteAll() {
        appareilDao.deleteAll();
    }
}
