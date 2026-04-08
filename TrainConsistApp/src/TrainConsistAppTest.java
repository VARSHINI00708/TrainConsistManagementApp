import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistAppTest {

    // ✅ Valid capacity
    @Test
    void testException_ValidCapacityCreation() throws Exception {
        TrainConsistApp.Bogie b = new TrainConsistApp.Bogie("Sleeper", 72);
        assertEquals(72, b.capacity);
    }

    // ❌ Negative capacity
    @Test
    void testException_NegativeCapacityThrowsException() {
        assertThrows(TrainConsistApp.InvalidCapacityException.class, () -> {
            new TrainConsistApp.Bogie("AC", -10);
        });
    }

    // ❌ Zero capacity
    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(TrainConsistApp.InvalidCapacityException.class, () -> {
            new TrainConsistApp.Bogie("AC", 0);
        });
    }

    // ✅ Exception message check
    @Test
    void testException_ExceptionMessageValidation() {
        Exception ex = assertThrows(TrainConsistApp.InvalidCapacityException.class, () -> {
            new TrainConsistApp.Bogie("AC", -5);
        });

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    // ✅ Object integrity
    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {
        TrainConsistApp.Bogie b = new TrainConsistApp.Bogie("AC Chair", 56);

        assertEquals("AC Chair", b.name);
        assertEquals(56, b.capacity);
    }

    // ✅ Multiple valid bogies
    @Test
    void testException_MultipleValidBogiesCreation() throws Exception {
        TrainConsistApp.Bogie b1 = new TrainConsistApp.Bogie("Sleeper", 72);
        TrainConsistApp.Bogie b2 = new TrainConsistApp.Bogie("AC", 50);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}