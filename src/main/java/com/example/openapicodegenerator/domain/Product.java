package com.example.openapicodegenerator.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;

    // 예시 생성 메소드
    public static Product of(Long id, String name) {
        Product pet = new Product();
        pet.setId(id);
        pet.setName(name);
        return pet;
    }
}