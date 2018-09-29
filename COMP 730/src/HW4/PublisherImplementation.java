package HW4;

import java.util.HashSet;
import java.util.Random;

public class PublisherImplementation implements PublisherInterface {
    private HashSet<Observer> Observers = new HashSet<Observer>();

    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyObservers(Observer o) {
        // TODO Auto-generated method stub

    }
    
    private Event generateEvent() {
        return new Event(0, 0);
    }
    
    public void runSimulation() {
        var evens = new SubscriberEvens();
        var odds = new SubscriberOdds();
        var threes = new SubscriberThrees();
        registerObserver(evens);
        registerObserver(odds);
        registerObserver(threes);
        
        var rand = new Random();
        
        for (int i = 0; i < 200; i++) {
            var e = new Event(i, rand.nextInt(5000) + 1);
            ;
        }
    }
}
