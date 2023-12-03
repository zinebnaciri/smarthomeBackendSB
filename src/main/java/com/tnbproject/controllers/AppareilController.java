package com.tnbproject.controllers;

import com.tnbproject.bean.Appareil;


import com.tnbproject.services.AppareilService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/appareils")
@AllArgsConstructor
public class AppareilController {

    private AppareilService appareilService;

    @GetMapping(value = "/")
    public List<Appareil> findAll() {
        return appareilService.findAll();
    }

    @PostMapping(value = "")
    public <S extends Appareil> S save(@RequestBody S entity) {
        return appareilService.save(entity);
    }

    @GetMapping(value = "id/{id}")
    public Optional<Appareil> findById(@PathVariable Long aLong) {
        return appareilService.findById(aLong);
    }

    @DeleteMapping(value = "id/{id}")
    public void deleteById(@PathVariable Long aLong) {
        appareilService.deleteById(aLong);
    }

    @DeleteMapping(value = "")
    public void deleteAll() {
        appareilService.deleteAll();
    }
}
