package service.observer;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class DersTalepSubject {

    private final List<TalepObserver> observers = new ArrayList<>();

    public DersTalepSubject() {
    }

    public void addObserver(TalepObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TalepObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (TalepObserver observer : observers) {
            observer.guncelleme(message);
        }
    }
}
