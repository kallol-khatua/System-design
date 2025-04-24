public interface WeatherStation {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setTemp(float temperature);
}
