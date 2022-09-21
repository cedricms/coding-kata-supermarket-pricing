package com.mariasube.cedric.coding.kata.supermarket.pricing.model.article;

import com.mariasube.cedric.coding.kata.supermarket.pricing.model.ArticleValue;

public class DefaultArticle extends Article {

    @Override
    public ArticleValue getArticleValue() {
        ArticleValue articleValue = new ArticleValue();

        if (this.price != null) {
            articleValue.setCurrency(this.price.getCurrency());

            articleValue.setValueInCents(this.price.getValueInCents());
        }

        return articleValue;
    }
}
