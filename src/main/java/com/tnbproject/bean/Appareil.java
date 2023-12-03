package com.tnbproject.bean;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Appareil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String description;
    private boolean state;
    @ManyToOne
    @JsonManagedReference
    private Category category;
}
