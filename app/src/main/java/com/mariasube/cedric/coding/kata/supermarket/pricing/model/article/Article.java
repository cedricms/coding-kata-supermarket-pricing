package com.mariasube.cedric.coding.kata.supermarket.pricing.model.article;

import com.mariasube.cedric.coding.kata.supermarket.pricing.model.ArticleValue;
import com.mariasube.cedric.coding.kata.supermarket.pricing.model.Price;
import lombok.Data;

@Data
public abstract class Article {

    protected String name;
    protected Price price;

    public abstract ArticleValue getArticleValue();
}
