package HW4;

public class SubscriberThrees implements Observer {

    @Override
    public boolean notifyObserver(Event e) {
        return e.getEventData() % 3 == 0;
    }
}
