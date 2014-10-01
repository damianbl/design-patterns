package eu.softelo.abstractfactory;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class MacOSXWindow implements Window {
    private String title;

    @Override
    public void setTitle(String text) {
        this.title = text;
    }

    @Override
    public void repaint() {
        System.out.println("Repaints with title: " + title);
    }
}
