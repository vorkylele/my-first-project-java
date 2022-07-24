package model;

import model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return Discount.noDiscount;
    }
    public int getAmount() {
        return amount;
    }
    public double getPrice() {
        return price;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
}

