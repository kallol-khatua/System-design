public class GUIFactoryProducer {

    public GUIFactory getGUIFactory(String osName) {

        if (osName.equalsIgnoreCase("WINDOWS")) {
            return new WindowsGUIFactory();
        }
        if (osName.equalsIgnoreCase("MAC")) {
            return new MacGUIFactory();
        }

        return null;

    }

}
