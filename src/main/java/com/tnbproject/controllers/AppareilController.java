package com.tnbproject.controllers;

import com.tnbproject.bean.Appareil;


import com.tnbproject.services.AppareilService;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/controller/appareil")
@CrossOrigin
public class AppareilController {




    @Autowired
    private AppareilService appareilService;

    @PostMapping("/")
    public Appareil save(@RequestBody Appareil appareil) {
        return appareilService.save(appareil);
    }

    @GetMapping("/id/{id}")
    public Optional<Appareil> findById(@PathVariable Long id) {
        return appareilService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
         appareilService.deleteById(id);
    }

    @GetMapping("/")
    public List<Appareil> findAll() {
        return appareilService.findAll();
    }


   

    @PutMapping("/update/updateall")
    public void updateAll(@RequestBody Appareil appInfo) {
        appareilService.updateAll(appInfo);
    }

}