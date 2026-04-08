import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class TrainConsistAppTest {

    // 🔹 1. Total calculation
    @Test
    void testReduce_TotalSeatCalculation() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 50),
                new TrainConsistApp.Bogie("B", 30)
        );

        int result = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(80, result);
    }

    // 🔹 2. Multiple bogies
    @Test
    void testReduce_MultipleBogiesAggregation() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 10),
                new TrainConsistApp.Bogie("B", 20),
                new TrainConsistApp.Bogie("C", 30)
        );

        int result = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(60, result);
    }

    // 🔹 3. Single bogie
    @Test
    void testReduce_SingleBogieCapacity() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 40)
        );

        int result = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(40, result);
    }

    // 🔹 4. Empty list
    @Test
    void testReduce_EmptyBogieList() {

        List<TrainConsistApp.Bogie> list = new ArrayList<>();

        int result = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(0, result);
    }

    // 🔹 5. Correct extraction
    @Test
    void testReduce_CorrectCapacityExtraction() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 15),
                new TrainConsistApp.Bogie("B", 25)
        );

        int result = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(40, result);
    }

    // 🔹 6. All bogies included
    @Test
    void testReduce_AllBogiesIncluded() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 5),
                new TrainConsistApp.Bogie("B", 15),
                new TrainConsistApp.Bogie("C", 20)
        );

        int result = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(40, result);
    }

    // 🔹 7. Original list unchanged
    @Test
    void testReduce_OriginalListUnchanged() {

        List<TrainConsistApp.Bogie> list = new ArrayList<>();
        list.add(new TrainConsistApp.Bogie("A", 50));
        list.add(new TrainConsistApp.Bogie("B", 30));

        int originalSize = list.size();

        list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(originalSize, list.size());
    }
}