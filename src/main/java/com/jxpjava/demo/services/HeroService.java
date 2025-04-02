package com.jxpjava.demo.services;

import com.jxpjava.demo.model.Hero;
import com.jxpjava.demo.model.repositories.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class HeroService {

    private HeroRepository heroRepository;
    private static final Random random = new Random();

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
        Hero hero = heroes.get(random.nextInt(heroes.size()));
        if (hero.getStrength() + hero.getDefense() + hero.getSpeed() + hero.getAccuracy() + hero.getIntelligence() + hero.getLuck() > 300) {
            throw new RuntimeException("La somme des propriétés du héros est supérieure à 300");
        }
        return hero;
    }

    public List<Hero> searchHeroesByName(String name) {
        return heroRepository.findAllByNameContaining(name);
    }
}