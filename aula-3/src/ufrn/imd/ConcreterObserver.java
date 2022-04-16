package ufrn.imd;

import java.util.Iterator;
import java.util.List;

public class ConcreterObserver implements Observer<String> {

    Iterator<String> it;

    @Override
    public void observer(List<String> event) {
        it = event.iterator();
    }

    @Override
    public void onNext(String next) {
        if(it.hasNext()){
            System.out.println("[LOG] : " + it.next() + " - " + next);
        }
    }

    @Override
    public void onComplete() {
        if(!it.hasNext()){
            System.out.println("on Complete");
        }
    }

}
