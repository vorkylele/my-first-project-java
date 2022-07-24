package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    public String colour;
    public Apple (int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }
    @Override
    public double getDiscount() {
        if (colour == Colour.appleRed) {
            return Discount.discountForAppleRed;
        }
        else {
            return Discount.noDiscount;
        }
    }
}