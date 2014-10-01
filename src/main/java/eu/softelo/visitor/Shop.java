package eu.softelo.visitor;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class Shop {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShoppingCart shoppingCart = new ShoppingCart();

        Book book1 = new Book(new BigDecimal("15.3"), 10);
        Book book2 = new Book(new BigDecimal("5.3"), 15);

        CD cd1 = new CD("Rolling Stones", false, new BigDecimal("14.5"), 30);

        shoppingCart.appendItems(Arrays.asList(book1, book2, cd1));

        System.out.println("Postage is : " + shoppingCart.calculatePostage());
    }
}
