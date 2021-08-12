package com.pluralsight.javaoopfundamentals;

import java.util.Optional;

public class Customer {

    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long ccNumber) {
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }

    public CreditCard getCreditCard(){
        return creditCard;
    }

    public int calculateDiscount(){
        return 0;
    }

    public Optional<Order> checkout (ShoppingCart cart){
        Optional<Payment> payment = creditCard.mkPayment(cart.getTotalCost());
        return payment.map(value -> new Order(this, cart, value)); // lambda takes the payment and applies to the order
        //return payment.isPresent() ? Optional.of(new Order(this, cart, payment.get())) : Optional.empty();
        /*
        if the optional is empty, it will throw the exception so we must guard against it with test. we are back to returnin null from the failed operation. so use optional throughout
         */

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
