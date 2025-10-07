package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    private final StockObservable stockObservable;
    private final String mobileNum;

    public MobileAlertObserverImpl(String mobileNum, StockObservable stockObservable) {
        this.stockObservable = stockObservable;
        this.mobileNum = mobileNum;
    }

    @Override
    public void update() {
        System.out.println("Sending new stock alert over mobile number " + mobileNum + " Stock " + stockObservable.getStock());
    }
}
