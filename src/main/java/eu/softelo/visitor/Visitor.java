package eu.softelo.visitor;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public interface Visitor {
    void visit(Book book);
    void visit(CD cd);

}
