package com.mariasube.cedric.coding.kata.supermarket.pricing.model;

import lombok.Data;

@Data
public class Article {

    private String name;

    private Price price;

    private int costInCentsPerWeightUnit;
    private String weightUnit;
    private int weight;
}
