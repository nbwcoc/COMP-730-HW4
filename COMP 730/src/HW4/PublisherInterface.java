package HW4;

public interface PublisherInterface {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(Event e);
}
