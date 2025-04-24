public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStationImpl();

        Observer mobile1 = new MobileObserver("One");
        Observer mobile2 = new MobileObserver("Two");
        Observer desktop = new DesktopObserver();

        ws.registerObserver(mobile1);
        ws.registerObserver(mobile2);
        ws.registerObserver(desktop);

        ws.setTemp(34.5f);
        System.out.println();

        ws.setTemp(35.4f);
        System.out.println();

        ws.removeObserver(mobile2);

        ws.setTemp(36.1f);

    }
}
