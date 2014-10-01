package eu.softelo.visitor;

import java.math.BigDecimal;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class CD implements ShoppingItem {
    private String title;
    private Boolean promo;
    private BigDecimal price;
    private double weight;

    public CD(String title, Boolean isPromo, BigDecimal price, double weight) {
        this.title = title;
        this.promo = isPromo;
        this.price = price;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public Boolean isPromo() {
        return promo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public ShoppingItem clone() throws CloneNotSupportedException {
        return new CD(this.title, this.promo, this.price, this.weight);
    }
}
