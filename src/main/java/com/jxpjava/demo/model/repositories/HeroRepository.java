package com.jxpjava.demo.model.repositories;

import com.jxpjava.demo.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeroRepository extends JpaRepository<Hero, Long> {
    List<Hero> findAllByNameContaining(String name);
}


