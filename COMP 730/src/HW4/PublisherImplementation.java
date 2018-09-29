package HW4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class PublisherImplementation implements PublisherInterface {
    private HashSet<Observer> observers = new HashSet<Observer>();
    private HashMap<Observer, Integer> counters = new HashMap<Observer, Integer>();
    int eventCounter = 0;
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        counters.remove(o);
    }

    @Override
    public void notifyObservers(Event e) {
        for (var observer : observers)
            if (observer.notifyObserver(e))
                counters.put(observer, counters.getOrDefault(observer, 0) + 1);
    }
    
    private Event generateEvent() {
        return new Event(eventCounter++, new Random().nextInt(5000) + 1);
    }
    
    public void runSimulation() {
        var evens = new SubscriberEvens();
        var odds = new SubscriberOdds();
        var threes = new SubscriberThrees();
        registerObserver(evens);
        registerObserver(odds);
        registerObserver(threes);
        
        for (int i = 0; i < 200; i++) {
            notifyObservers(generateEvent());
            
            if (i % 40 == 0) {
                if (!observers.contains(odds))
                    registerObserver(odds);
                if (!observers.contains(threes))
                    registerObserver(threes);
            }
            
            if (counters.getOrDefault(odds, 0) > 20)
                removeObserver(odds);
            if (counters.getOrDefault(threes, 0) > 6)
                removeObserver(threes);
        }
    }
}
