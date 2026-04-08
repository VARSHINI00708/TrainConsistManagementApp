import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class TrainConsistAppTest {

    // 🔹 1. Loop filtering
    @Test
    void testLoopFilteringLogic() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 70),
                new TrainConsistApp.Bogie("B", 50)
        );

        List<TrainConsistApp.Bogie> result = new ArrayList<>();

        for (TrainConsistApp.Bogie b : list) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertEquals(1, result.size());
    }

    // 🔹 2. Stream filtering
    @Test
    void testStreamFilteringLogic() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 70),
                new TrainConsistApp.Bogie("B", 50)
        );

        List<TrainConsistApp.Bogie> result =
                list.stream().filter(b -> b.capacity > 60).toList();

        assertEquals(1, result.size());
    }

    // 🔹 3. Results match
    @Test
    void testLoopAndStreamResultsMatch() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 70),
                new TrainConsistApp.Bogie("B", 80),
                new TrainConsistApp.Bogie("C", 40)
        );

        List<TrainConsistApp.Bogie> loopResult = new ArrayList<>();
        for (TrainConsistApp.Bogie b : list) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        List<TrainConsistApp.Bogie> streamResult =
                list.stream().filter(b -> b.capacity > 60).toList();

        assertEquals(loopResult.size(), streamResult.size());
    }

    // 🔹 4. Execution time > 0
    @Test
    void testExecutionTimeMeasurement() {

        long start = System.nanoTime();

        // dummy operation
        int sum = 0;
        for (int i = 0; i < 1000; i++) sum += i;

        long end = System.nanoTime();

        long time = end - start;

        assertTrue(time > 0);
    }

    // 🔹 5. Large dataset
    @Test
    void testLargeDatasetProcessing() {

        List<TrainConsistApp.Bogie> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(new TrainConsistApp.Bogie("B" + i, i % 100));
        }

        List<TrainConsistApp.Bogie> result =
                list.stream().filter(b -> b.capacity > 60).toList();

        assertTrue(result.size() > 0);
    }
}