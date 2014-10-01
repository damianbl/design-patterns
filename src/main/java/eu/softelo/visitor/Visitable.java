package eu.softelo.visitor;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public interface Visitable {
    void accept(Visitor visitor);
}
