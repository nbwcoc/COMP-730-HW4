package HW4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriberThreesTest {

    SubscriberThrees testObject = new SubscriberThrees();
    
    @Test
    void testNotifyObserver() {
        assertTrue(testObject.notifyObserver(new Event(0, 3)));
    }
    
    @Test
    void testNotifyObserverNegative() {
        assertFalse(testObject.notifyObserver(new Event(0, 2)));
    }
}
