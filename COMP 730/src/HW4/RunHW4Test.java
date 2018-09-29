package HW4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class RunHW4Test {

    @Test
    void testMain() {
        var os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        RunHW4.main(new String[0]);
        
        // this assumes that the random number series that will generate the
        // smallest output is a series consisting of an odd number not divisible by three
        // 30 = rough size of the string printed by the subscribers
        // 20 = number of consecutive times SubscriberOdds can return true before being unsubscribed
        // 4 = max number of times SubscriberOdds is subscribed.
        assertTrue(os.toString().length() > 30 * 20 * 4);
    }

}
