package HW4;

public class SubscriberThrees implements Observer {

    @Override
    public boolean notifyObserver(Event e) {
        if (e.getEventData() % 3 == 0) {
            System.out.printf("# %d: %d is divisible by three", e.getEventNumber(), e.getEventData());
            return true;
        }
        return false;
    }
}
