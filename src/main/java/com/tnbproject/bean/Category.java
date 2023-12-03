package com.tnbproject.bean;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    @OneToMany(targetEntity = Appareil.class, mappedBy = "category", fetch = FetchType.LAZY)
    private List<Appareil> appareils;
}
