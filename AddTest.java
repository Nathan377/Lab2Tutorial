import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void doAddition() {
        Add numbers = new Add(1,2);
        int result = numbers.doAddition();
        assertEquals(3, result);
    }
}
