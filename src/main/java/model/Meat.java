package model;

public class Meat extends Food implements Discountable {
    public Meat (int amount, double price) {
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }
}
