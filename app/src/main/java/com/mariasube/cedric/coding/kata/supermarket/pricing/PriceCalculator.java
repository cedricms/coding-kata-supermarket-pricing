package com.mariasube.cedric.coding.kata.supermarket.pricing;

import com.mariasube.cedric.coding.kata.supermarket.pricing.model.Price;
import com.mariasube.cedric.coding.kata.supermarket.pricing.model.Purchase;

import java.util.List;

public class PriceCalculator {

    public Price calculate(List<Purchase> purchases){
        Price resultPrice = new Price();

        if (purchases != null) {
            purchases.stream().forEach(purchase -> calculateForPurchase(purchase, resultPrice));
        }

        return resultPrice;
    }

    private void calculateForPurchase(Purchase purchase, Price price) {
        price.setValueInCents(price.getValueInCents() + purchase.calculatePrice());
    }
}
