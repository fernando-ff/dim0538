package ufrn.imd;

import java.util.List;

public interface Subject <T>{
    void registerObserver(Observer<T> observer);
    void unregisterObserver(Observer<T> observer);
    void notifyObservers(List<T> event);
}
