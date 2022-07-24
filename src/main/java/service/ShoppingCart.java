package service;

import model.Apple;
import model.Food;
import model.constants.Colour;

public class ShoppingCart {
    public Food[] shoppingCart;

    public ShoppingCart (Food[] shoppingCart) {
        this.shoppingCart = shoppingCart;
        fullPrice();
        priceWithDiscount();
        priceOfVegetarianProducts();
    }
    public double fullPrice() {
        double price = 0.0;
        for (int i = 0; i < shoppingCart.length; i++) {
            price += shoppingCart[i].getPrice() * shoppingCart[i].getAmount();
        }
        return price;
    }
    public double priceWithDiscount() {
        double priceWithDiscount = 0.0;
        for (int i = 0; i < shoppingCart.length; i++) {
            priceWithDiscount += shoppingCart[i].getAmount() * (shoppingCart[i].getPrice() - (shoppingCart[i].getPrice() * (shoppingCart[i].getDiscount() / 100)));
        }
        return priceWithDiscount;
    }
    public double priceOfVegetarianProducts() {
        double priceOfVegetarianProducts = 0.0;
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i].isVegetarian()) {
                priceOfVegetarianProducts =+ shoppingCart[i].getPrice() * shoppingCart[i].getAmount();
            }
        }
        return priceOfVegetarianProducts;
    }
}
