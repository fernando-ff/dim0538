package ufrn.imd;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Subject<String> subject = new ConcreteSubject();
        Observer<String> observerA = new ConcreterObserver();

        subject.registerObserver(observerA);

        subject.notifyObservers(List.of("Eh o teste!", "Eh o teste2!"));
        observerA.onNext("Criolo doido");
        observerA.onNext("Fernando Ferreira shudasduashd");
        observerA.onComplete();
    }
}
