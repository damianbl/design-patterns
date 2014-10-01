package eu.softelo.visitor;

import java.math.BigDecimal;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class PostageVisitor implements Visitor {
    private static final String VAL = "10.0";

    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice().compareTo(new BigDecimal(VAL)) > 0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice().compareTo(new BigDecimal(VAL)) > 0 && !cd.isPromo()) {
            totalPostageForCart += cd.getWeight() * 2;
        }
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }
}
