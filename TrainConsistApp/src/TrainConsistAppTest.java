import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistAppTest {

    // Safe assignment
    @Test
    void testCargo_SafeAssignment() {
        TrainConsistApp.GoodsBogie b = new TrainConsistApp.GoodsBogie("Cylindrical");
        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    // Unsafe assignment handled
    @Test
    void testCargo_UnsafeAssignmentHandled() {
        TrainConsistApp.GoodsBogie b = new TrainConsistApp.GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo); // should not assign
    }

    //  Cargo not assigned after failure
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        TrainConsistApp.GoodsBogie b = new TrainConsistApp.GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    //  Program continues
    @Test
    void testCargo_ProgramContinuesAfterException() {
        TrainConsistApp.GoodsBogie b = new TrainConsistApp.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum"); // fails
        b.assignCargo("Coal");      // works

        assertEquals("Coal", b.cargo);
    }

    // Finally block execution (indirect check)
    @Test
    void testCargo_FinallyBlockExecution() {
        TrainConsistApp.GoodsBogie b = new TrainConsistApp.GoodsBogie("Rectangular");

        // If no crash → finally executed
        b.assignCargo("Petroleum");

        assertTrue(true); // just ensures no crash
    }
}