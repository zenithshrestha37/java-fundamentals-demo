package com.pluralsight.javaoopfundamentals;

import java.util.HashMap;
import java.util.Map;

import static com.pluralsight.javaoopfundamentals.ProductType.DIGITAL;
import static com.pluralsight.javaoopfundamentals.ProductType.PHYSICAL;

public class Catalogue {

    public final static int SHIPPING_RATE = 5;

/*
    // Java 9 and later
    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3550),
            "Baby Alarm", new Product("Baby Alarm", 4999)
    );
*/

    // Java 8 and earlier
    public static Map<String,Product> productMap = Map.of(

            "Electric Toothbrush", new Product("Electric Toothbrush", 3000, PHYSICAL, 400),
            "Baby Alarm", new Product("Baby Alarm", 5000, PHYSICAL, 1000),
            "War and Peace (e-book)", new Product( "War and Peace (e-book)", 1000, DIGITAL, -1)
            );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
