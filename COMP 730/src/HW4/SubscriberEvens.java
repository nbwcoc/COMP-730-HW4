package HW4;

public class SubscriberEvens implements Observer {

    @Override
    public boolean notifyObserver(Event e) {
        return e.getEventData() % 2 == 0;
    }
}
