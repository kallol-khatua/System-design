public class DesktopObserver implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("Desktop observer , temp -> " + temperature);
    }

}
