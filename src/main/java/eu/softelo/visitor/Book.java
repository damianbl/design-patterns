package eu.softelo.visitor;

import java.math.BigDecimal;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class Book implements ShoppingItem {
    private BigDecimal price;
    private double weight;

    public Book(BigDecimal price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public ShoppingItem clone() throws CloneNotSupportedException {
        return new Book(this.getPrice(), this.getWeight());
    }
}
