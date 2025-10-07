package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {
    private final List<NotificationAlertObserver> observers= new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void addObserver(NotificationAlertObserver notificationAlertObserver) {
        observers.add(notificationAlertObserver);
    }

    @Override
    public void removeObserver(NotificationAlertObserver notificationAlertObserver) {
        observers.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObserver() {
        for(NotificationAlertObserver observer: observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int data) {
        boolean wasEmpty = this.stockCount == 0;

        this.stockCount += data;

        if(wasEmpty) {
            notifyObserver();
        }
    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
