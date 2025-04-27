public class GUIFactoryApplication {
    public static void main(String[] args) {
        GUIFactoryProducer producer = new GUIFactoryProducer();

        String osName = "Windows";
        GUIFactory guiFactory = producer.getGUIFactory(osName);

        Button button = guiFactory.createButton();
        button.click();

        Checkbox checkbox = guiFactory.createCheckbox();
        checkbox.check();
    }
}
