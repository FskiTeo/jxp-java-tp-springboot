package com.jxpjava.demo.services;

import com.jxpjava.demo.model.Hero;
import com.jxpjava.demo.model.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public List<Hero> getAllHeroes() {
        return heroRepository.findAll();
    }

    public Hero getHeroById(Long id) {
        return heroRepository.findById(id).orElse(null);
    }

    public Hero saveHero(Hero hero) {
        return heroRepository.save(hero);
    }

    public Hero getRandomHero() {
        List<Hero> heroes = heroRepository.findAll();
        Random random = new Random();
        return heroes.get(random.nextInt(heroes.size()));
    }

    public List<Hero> searchHeroesByName(String name) {
        return heroRepository.findAllByNameContaining(name);
    }
}