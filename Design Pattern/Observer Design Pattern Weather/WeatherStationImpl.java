import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStation {
    private final List<Observer> observerList = new ArrayList<>();
    private float temperature = 0.0f;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update(temperature);
        }
    }

    @Override
    public void setTemp(float temperature){
        this.temperature = temperature;
        notifyObserver();
    }
}
