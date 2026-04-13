import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistAppTest {

    // 🔹 1. Bogie Found
    @Test
    void testSearch_BogieFound() {

        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(TrainConsistApp.linearSearch(arr, "BG309"));
    }

    // 🔹 2. Bogie Not Found
    @Test
    void testSearch_BogieNotFound() {

        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(TrainConsistApp.linearSearch(arr, "BG999"));
    }

    // 🔹 3. First Element Match
    @Test
    void testSearch_FirstElementMatch() {

        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(TrainConsistApp.linearSearch(arr, "BG101"));
    }

    // 🔹 4. Last Element Match
    @Test
    void testSearch_LastElementMatch() {

        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(TrainConsistApp.linearSearch(arr, "BG309"));
    }

    // 🔹 5. Single Element
    @Test
    void testSearch_SingleElementArray() {

        String[] arr = {"BG101"};

        assertTrue(TrainConsistApp.linearSearch(arr, "BG101"));
    }

}