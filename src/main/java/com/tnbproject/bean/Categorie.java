package com.tnbproject.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;

    @OneToMany(targetEntity = Appareil.class , mappedBy = "categorie", fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"categorie"})
    List<Appareil> appareilList;
}