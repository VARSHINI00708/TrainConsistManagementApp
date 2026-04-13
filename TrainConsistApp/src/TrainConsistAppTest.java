import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistAppTest {

    // 🔹 1. Exception when empty
    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {

        String[] bogies = {};

        assertThrows(IllegalStateException.class, () -> {
            TrainConsistApp.searchBogie(bogies, "BG101");
        });
    }

    // 🔹 2. Allows search when data exists
    @Test
    void testSearch_AllowsSearchWhenDataExists() {

        String[] bogies = {"BG101", "BG205"};

        assertDoesNotThrow(() -> {
            TrainConsistApp.searchBogie(bogies, "BG101");
        });
    }

    // 🔹 3. Bogie found
    @Test
    void testSearch_BogieFoundAfterValidation() {

        String[] bogies = {"BG101", "BG205", "BG309"};

        boolean result = TrainConsistApp.searchBogie(bogies, "BG205");

        assertTrue(result);
    }

    // 🔹 4. Bogie not found
    @Test
    void testSearch_BogieNotFoundAfterValidation() {

        String[] bogies = {"BG101", "BG205", "BG309"};

        boolean result = TrainConsistApp.searchBogie(bogies, "BG999");

        assertFalse(result);
    }

    // 🔹 5. Single element case
    @Test
    void testSearch_SingleElementValidCase() {

        String[] bogies = {"BG101"};

        boolean result = TrainConsistApp.searchBogie(bogies, "BG101");

        assertTrue(result);
    }
}