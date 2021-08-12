package com.pluralsight.javaoopfundamentals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.pluralsight.javaoopfundamentals.BusinessCustomer.BusinessSize.LARGE;

public class Demo {
    public static void main(String[] args) {

//        Customer janeDoe = new Customer("Jane Doe", 542093615183044L);
//        Customer acme = new BusinessCustomer("Acme Products", 455642663443553L, LARGE);
//        Customer globex = new BusinessCustomer("Globex Corp", 5463503666563574L, LARGE);
//        Customer saveTheWorld = new NonprofitCustomer("Save the World", 5381428244287646L);
//
//        List<Customer> customers = List.of(janeDoe, acme, globex, saveTheWorld);
//
//        Map<Integer, Long> discountMap = customers.stream()
//                .collect(Collectors.groupingBy(Customer::calculateDiscount, Collectors.counting()));
//        System.out.println(discountMap);

//        Map<> discountMap = new HashMap<>();
//        for (Customer c: customers){
//            discountMap.merge(c.calculateDiscount()), 1L, Long :: sum);
//        }
//        System.out.println("discountMap");




//        // creating new Product objects for every program execution
        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

        ShoppingCart cart = new ShoppingCart();
        cart.addLineItem(new LineItem(babyAlarm, 1));
        cart.addLineItem(new LineItem(warAndPeace, 1));
        LineItem toothbrushes = new LineItem(toothbrush, 2);
        cart.addLineItem(toothbrushes);

        Customer janeDoe = new Customer("Jane Doe");
        janeDoe.addPaymentMethod("Jane's Credit Card", new CreditCard(5420793615183044L));
        janeDoe.addPaymentMethod("Jane's Bank Account", new BankAccount(80_80_80, 00646160));

        Optional<Order> order = janeDoe.checkout(cart, "Jane's Bank Account");
        System.out.println(order);
//
//
//        Customer johnDoe = new Customer("John Doe", 5420793615183044L);
//        Optional<Order> order = johnDoe.checkout(cart);
//        System.out.println(order);


//        public static void fulfil (Order o){
//            ShoppingCart cart = o.getCart();
//            boolean shippingUnfinished;
//            do {
//                shippingUnfinished = false;
//                for (LineItem li :cart.getLineItems()){
//                    boolean fulfilHalf = Math.random() > 0.7;
//                    if(fulfilHalf) {
//                        li.setQuantity(li.getQuantity()/2);
//                        shippingUnfinished = true;
//                    } else {
//                        li.setQuantity(0);
//                    }
//                    System.out.println("fulfilHalf");
//                }
//            } while (shippingUnfinished);
//        }
    }

}

