package eu.softelo.abstractfactory;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class MacOSXWindowWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        Window window = new MacOSXWindow();
        window.setTitle("MacOSX");
        return window;
    }
}
