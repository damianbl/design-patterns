package eu.softelo.abstractfactory;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class GUIBuilder {
    public void buildWindow(AbstractWidgetFactory widgetFactory) {
        Window window = widgetFactory.createWindow();
        window.repaint();
    }
}