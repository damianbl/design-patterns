package eu.softelo.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class ShoppingCart {
    private List<ShoppingItem> items = new ArrayList<>();

    public void appendItems(List<ShoppingItem> items) throws CloneNotSupportedException {
        for (ShoppingItem item : items) {
            this.items.add(item.clone());
        }
    }

    public List<ShoppingItem> retrieveItems() throws CloneNotSupportedException {
        List<ShoppingItem> items = new ArrayList<>();
        for (ShoppingItem item : items) {
            items.add(item.clone());
        }
        return items;
    }

    public double calculatePostage() {
        PostageVisitor visitor = new PostageVisitor();

        for (ShoppingItem item : items) {
            ((Visitable) item).accept(visitor);
        }

        return visitor.getTotalPostageForCart();
    }
}
