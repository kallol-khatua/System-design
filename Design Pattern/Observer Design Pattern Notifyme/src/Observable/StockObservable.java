package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
    void addObserver(NotificationAlertObserver notificationAlertObserver);
    void removeObserver(NotificationAlertObserver notificationAlertObserver);
    void notifyObserver();
    void setStock(int data);
    int getStock();
}
