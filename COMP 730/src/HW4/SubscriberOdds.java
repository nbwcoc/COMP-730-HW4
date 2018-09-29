package HW4;

public class SubscriberOdds implements Observer {

    @Override
    public boolean notifyObserver(Event e) {
        if (e.getEventData() % 2 == 1) {
            System.out.printf("# %d: #d is odd\n", e.getEventNumber(), e.getEventData());
            return true;
        }
        return false;
    }
}
