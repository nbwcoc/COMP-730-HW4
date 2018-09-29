package HW4;

public class SubscriberOdds implements Observer {

    @Override
    public boolean notifyObserver(Event e) {
        return e.getEventData() % 2 == 1;
        // TODO Auto-generated method stub

    }

}
