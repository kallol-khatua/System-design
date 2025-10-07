package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    private final StockObservable stockObservable;
    private final String email;

    public EmailAlertObserverImpl(String email, StockObservable stockObservable) {
        this.stockObservable = stockObservable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Sending new stock alert over email " + email + " Stock " + stockObservable.getStock());
    }
}
