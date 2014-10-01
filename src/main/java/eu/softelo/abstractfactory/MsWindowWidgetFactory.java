package eu.softelo.abstractfactory;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class MsWindowWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        Window window = new MsWindow();
        window.setTitle("Window");
        return window;
    }
}
