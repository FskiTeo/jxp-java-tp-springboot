package com.jxpjava.demo.model.mappers;

import com.jxpjava.demo.model.Hero;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HeroMapper {

    HeroDto toDto(Hero hero);

    Hero toEntity(HeroDto heroDto);
}
