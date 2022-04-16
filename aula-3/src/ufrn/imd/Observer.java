package ufrn.imd;

import java.util.List;

public interface Observer <T>{
    void observer(List<T> event);
    void onNext(T next);
    void onComplete();
}
