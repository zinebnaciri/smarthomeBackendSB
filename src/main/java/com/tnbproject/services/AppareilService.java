package com.tnbproject.services;

import com.tnbproject.bean.Appareil;

import com.tnbproject.repositories.AppareilRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppareilService {



    @Autowired
    private AppareilRepository appareilRepository;

    public  Appareil save(Appareil appareil) {
        return appareilRepository.save(appareil);
    }

    public Optional<Appareil> findById(Long id) {
        return appareilRepository.findById(id);
    }

    public void deleteById(Long id) {
        appareilRepository.deleteById(id);
    }

    public List<Appareil> findAll() {
        return appareilRepository.findAll();
    }

   

    public void updateAll( Appareil appInfo){
        List<Appareil> appareilList =appareilRepository.findAll();
        for (Appareil appareil:appareilList) {
            appareil.setState(appInfo.isState());
            appareilRepository.save(appareil);
        }

    }

}