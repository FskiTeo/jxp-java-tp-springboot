package com.jxpjava.demo.model.mappers;

import lombok.Data;

@Data
public class HeroDto {
    private String name;
    private String universe;
    private int strength;
    private int defense;
    private int speed;
    private int accuracy;
    private int intelligence;
    private int luck;
}
