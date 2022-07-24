import model.Apple;
import model.Discountable;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, "red");
        Food appleGreen = new Apple(8, 60, "green");
        Food[] allFood = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(allFood);
        System.out.println(shoppingCart.fullPrice());
        System.out.println(shoppingCart.fullPrice() - shoppingCart.priceWithDiscount());
        System.out.println(shoppingCart.priceOfVegetarianProducts());

    }
}
