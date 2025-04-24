public class MobileObserver implements Observer {

    private String name = "";

    public MobileObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " Mobile observer temp -> " + temperature);
    }
}
