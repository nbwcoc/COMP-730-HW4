package HW4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriberOddsTest {

    SubscriberOdds testObject = new SubscriberOdds();
    
    @Test
    void testNotifyObserver() {
        assertTrue(testObject.notifyObserver(new Event(0, 1)));
    }
    
    @Test
    void testNotifyObserverNegative() {
        assertFalse(testObject.notifyObserver(new Event(0, 2)));
    }

}
