package eu.softelo.abstractfactory;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class Main {
    private static final String MACOSX = "MACOSX";

    public static void main(String[] args) {
        GUIBuilder guiBuilder = new GUIBuilder();
        AbstractWidgetFactory widgetFactory;

        if (MACOSX.equals(Platform.currentPlatform())) {
            widgetFactory = new MacOSXWindowWidgetFactory();
        } else {
            widgetFactory = new MsWindowWidgetFactory();
        }

        guiBuilder.buildWindow(widgetFactory);
    }
}
