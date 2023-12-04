package com.tnbproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnbproject.bean.Appareil;

public interface AppareilRepository extends JpaRepository<Appareil,Long> {
}