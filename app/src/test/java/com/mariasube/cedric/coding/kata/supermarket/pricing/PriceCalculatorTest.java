package com.mariasube.cedric.coding.kata.supermarket.pricing;

import com.mariasube.cedric.coding.kata.supermarket.pricing.model.Article;
import com.mariasube.cedric.coding.kata.supermarket.pricing.model.Price;
import com.mariasube.cedric.coding.kata.supermarket.pricing.model.Purchase;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculatorTest {

    @Test
    public void calculateWhenNullPurchaseThenZero() {
        // Given
        PriceCalculator priceCalculator = new PriceCalculator();
        List<Purchase> purchases = null;

        // When
        Price calculatedPrice = priceCalculator.calculate(purchases);

        // Then
        assertThat(calculatedPrice).isEqualTo(new Price());
    }

    @Test
    public void calculateWhenNoPurchaseThenZero() {
        // Given
        PriceCalculator priceCalculator = new PriceCalculator();
        List<Purchase> purchases = new ArrayList<>();

        // When
        Price calculatedPrice = priceCalculator.calculate(purchases);

        // Then
        assertThat(calculatedPrice).isEqualTo(new Price());
    }

    @Test
    public void calculateWhenOnePurchaseByQuantityThenPrice() {
        // Given
        PriceCalculator priceCalculator = new PriceCalculator();

        int valueInCents = 77;

        Purchase purchase = createPurchase(valueInCents, 1);

        List<Purchase> purchases = new ArrayList<>();
        purchases.add(purchase);

        // When
        Price calculatedPrice = priceCalculator.calculate(purchases);

        // Then
        Price resultPrice = new Price();
        resultPrice.setValueInCents(valueInCents);

        assertThat(calculatedPrice).isEqualTo(resultPrice);
    }


    @Test
    public void calculateWhenMultiplePurchaseByQuantityThenPrice() {
        // Given
        PriceCalculator priceCalculator = new PriceCalculator();

        List<Purchase> purchases = new ArrayList<>();

        Purchase purchase1 = createPurchase(77, 3);
        purchases.add(purchase1);
        Purchase purchase2 = createPurchase(33, 7);
        purchases.add(purchase2);
        Purchase purchase3 = createPurchase(555, 13);
        purchases.add(purchase3);

        // When
        Price calculatedPrice = priceCalculator.calculate(purchases);

        // Then
        Price resultPrice = new Price();
        resultPrice.setValueInCents(7677);

        assertThat(calculatedPrice).isEqualTo(resultPrice);
    }

    private Purchase createPurchase(int valueInCents, int quantity) {
        Purchase purchase = new Purchase();
        purchase.setQuantity(quantity);
        Article article = new Article();
        Price price = new Price();
        price.setValueInCents(valueInCents);
        article.setPrice(price);
        purchase.setArticle(article);
        return purchase;
    }
}
