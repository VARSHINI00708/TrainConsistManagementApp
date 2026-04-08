import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Collectors;

class TrainConsistAppTest {

    // 🔹 1. Capacity > Threshold
    @Test
    void testFilter_CapacityGreaterThanThreshold() {

        List<TrainConsistApp.Bogie> list = new ArrayList<>();
        list.add(new TrainConsistApp.Bogie("A", 80));
        list.add(new TrainConsistApp.Bogie("B", 50));

        List<TrainConsistApp.Bogie> result =
                list.stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertEquals(1, result.size());
        assertEquals(80, result.get(0).capacity);
    }

    // 🔹 2. Equal to Threshold
    @Test
    void testFilter_CapacityEqualToThreshold() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 70)
        );

        List<TrainConsistApp.Bogie> result =
                list.stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    // 🔹 3. Less than Threshold
    @Test
    void testFilter_CapacityLessThanThreshold() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 20),
                new TrainConsistApp.Bogie("B", 30)
        );

        List<TrainConsistApp.Bogie> result =
                list.stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    // 🔹 4. Multiple Matching
    @Test
    void testFilter_MultipleBogiesMatching() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 80),
                new TrainConsistApp.Bogie("B", 90),
                new TrainConsistApp.Bogie("C", 50)
        );

        List<TrainConsistApp.Bogie> result =
                list.stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    // 🔹 5. No Matching
    @Test
    void testFilter_NoBogiesMatching() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 10),
                new TrainConsistApp.Bogie("B", 20)
        );

        List<TrainConsistApp.Bogie> result =
                list.stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    // 🔹 6. All Matching
    @Test
    void testFilter_AllBogiesMatching() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("A", 80),
                new TrainConsistApp.Bogie("B", 90)
        );

        List<TrainConsistApp.Bogie> result =
                list.stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    // 🔹 7. Empty List
    @Test
    void testFilter_EmptyBogieList() {

        List<TrainConsistApp.Bogie> list = new ArrayList<>();

        List<TrainConsistApp.Bogie> result =
                list.stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    // 🔹 8. Original List Unchanged
    @Test
    void testFilter_OriginalListUnchanged() {

        List<TrainConsistApp.Bogie> list = new ArrayList<>();
        list.add(new TrainConsistApp.Bogie("A", 80));
        list.add(new TrainConsistApp.Bogie("B", 40));

        int originalSize = list.size();

        list.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        assertEquals(originalSize, list.size());
    }
}