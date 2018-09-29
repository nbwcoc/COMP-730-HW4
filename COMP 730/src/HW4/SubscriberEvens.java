package HW4;

public class SubscriberEvens implements Observer {

    @Override
    public boolean notifyObserver(Event e) {
        if (e.getEventData() % 2 == 0) {
            System.out.printf("# %d: %d is even\n", e.getEventNumber(), e.getEventData());
            return true;
        }
        return false;
    }
}
