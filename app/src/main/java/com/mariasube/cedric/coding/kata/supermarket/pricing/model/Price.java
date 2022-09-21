package com.mariasube.cedric.coding.kata.supermarket.pricing.model;

import lombok.Data;

@Data
public class Price {

    private String currency;
    private int valueInCents;

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Price or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Price)) {
            return false;
        }

        // Typecast o to Price so that we can compare data members
        Price p = (Price) o;

        // Compare the data members and return accordingly
        return compareCurrency(currency, p.currency)
                && Integer.compare(valueInCents, p.valueInCents) == 0;
    }

    private boolean compareCurrency(String currency1, String currency2) {
        if (currency1 == null) {
            if (currency2 == null) {
                return true;
            }
        }

        return false;
    }
}
