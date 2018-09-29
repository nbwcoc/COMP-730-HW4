package HW4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PublisherImplementationTest {

    PublisherImplementation testObject = new PublisherImplementation();
    
    class MockObserver implements Observer {
        private boolean notified;
        
        public boolean notifyObserver(Event e) {
            notified = true;
            return true;
        }
        
        public boolean wasNotified() {
            return notified;
        }
        
        public void resetNotified() {
            notified = false;
        }
    }
    
    MockObserver testObserver = new MockObserver();

    @Test
    void testNotifyObservers() {
        testObserver.resetNotified();
        testObject.registerObserver(testObserver);
        testObject.notifyObservers(new Event(0, 0));
        assertTrue(testObserver.wasNotified());
    }
    
    @Test
    void testDeregisteredNotify() {
        testObserver.resetNotified();
        testObject.removeObserver(testObserver);
        testObject.notifyObservers(new Event(0, 0));
        assertFalse(testObserver.wasNotified());
    }
}
