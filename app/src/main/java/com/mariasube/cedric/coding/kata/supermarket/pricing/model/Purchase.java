package com.mariasube.cedric.coding.kata.supermarket.pricing.model;

import com.mariasube.cedric.coding.kata.supermarket.pricing.model.article.Article;
import lombok.Data;

@Data
public class Purchase {

    private int quantity;
    private int weightUnit;
    private int weight;
    private Article article;

    public int calculatePrice() {
        if (article != null) {
            Price price = article.getPrice();
            if (price != null) {
                return quantity * price.getValueInCents();
            }
        }

        return 0;
    }
}
