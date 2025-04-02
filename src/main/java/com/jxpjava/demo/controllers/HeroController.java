package com.jxpjava.demo.controllers;

import com.jxpjava.demo.model.Hero;
import com.jxpjava.demo.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heroes")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping
    public List<Hero> getAllHeroes() {
        return heroService.getAllHeroes();
    }

    @PostMapping
    public Hero saveHero(@RequestBody Hero hero) {
        return heroService.saveHero(hero);
    }

    @GetMapping("/{id}")
    public Hero getHeroById(@PathVariable Long id) {
        return heroService.getHeroById(id);
    }

    @GetMapping("/random")
    public Hero getRandomHero() {
        return heroService.getRandomHero();
    }

    @GetMapping("/search")
    public List<Hero> searchHeroesByName(@RequestParam String name) {
        return heroService.searchHeroesByName(name);
    }
}
