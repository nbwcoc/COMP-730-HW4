package HW4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class EventTest {

    Event testObject;
    int testNumber;
    int testData;
    
    EventTest() {
        var rand = new Random();
        testNumber = rand.nextInt();
        testData = rand.nextInt();
        testObject = new Event(testNumber, testData);
    }

    @Test
    void testGetEventData() {
        assertEquals(testObject.getEventData(), testData);
    }

    @Test
    void testGetEventNumber() {
        assertEquals(testObject.getEventNumber(), testNumber);
    }
}
