import Observable.IphoneStockObservable;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iPhoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver mobileNotificationObserver = new MobileAlertObserverImpl(
                "7585028854", iPhoneStockObservable);
        NotificationAlertObserver emailNotificationObserver = new EmailAlertObserverImpl(
                "kallolkhatua2005@gmail.com", iPhoneStockObservable);

        iPhoneStockObservable.addObserver(mobileNotificationObserver);
        iPhoneStockObservable.addObserver(emailNotificationObserver);

        iPhoneStockObservable.setStock(40);
//        iPhoneStockObservable.removeObserver(emailNotificationObserver);
        System.out.println(iPhoneStockObservable.getStock());;
        iPhoneStockObservable.setStock(-40);
        iPhoneStockObservable.setStock(10);
    }
}
