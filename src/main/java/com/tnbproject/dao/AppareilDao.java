package com.tnbproject.dao;

import com.tnbproject.bean.Appareil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppareilDao extends JpaRepository<Appareil, Long> {
}
