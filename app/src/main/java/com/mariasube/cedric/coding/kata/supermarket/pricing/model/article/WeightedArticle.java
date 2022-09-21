package com.mariasube.cedric.coding.kata.supermarket.pricing.model.article;

import com.mariasube.cedric.coding.kata.supermarket.pricing.model.ArticleValue;

public class WeightedArticle extends Article {

    private int costInCentsPerWeightUnit;
    private String weightUnit;
    private int weight;

    @Override
    public ArticleValue getArticleValue() {
        ArticleValue articleValue = new ArticleValue();

        if (this.price != null) {
            articleValue.setCurrency(this.price.getCurrency());

            articleValue.setValueInCents(this.costInCentsPerWeightUnit * this.weight);
        }

        return articleValue;
    }
}
