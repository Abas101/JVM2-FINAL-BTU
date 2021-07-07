package saba.kikvidze.model;

import java.util.ArrayList;

public class CurrencyDummyData {

    public static ArrayList<Currency> get() {
        ArrayList<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency("GEL", 1, "ქართული ლარი"));
        currencies.add(new Currency("USD", 3.16, "აშშ დოლარი"));
        currencies.add(new Currency("GEL", 3.72, "ევრო"));
        return  currencies;
    }
}
