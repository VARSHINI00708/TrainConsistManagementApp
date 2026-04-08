import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Collectors;

class TrainConsistAppTest {

    @Test
    void testGrouping_BogiesGroupedByType() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("Sleeper", 72),
                new TrainConsistApp.Bogie("Sleeper", 70)
        );

        Map<String, List<TrainConsistApp.Bogie>> result =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("AC", 50),
                new TrainConsistApp.Bogie("AC", 60)
        );

        Map<String, List<TrainConsistApp.Bogie>> result =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.get("AC").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("Sleeper", 72),
                new TrainConsistApp.Bogie("AC", 50)
        );

        Map<String, List<TrainConsistApp.Bogie>> result =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyBogieList() {

        List<TrainConsistApp.Bogie> list = new ArrayList<>();

        Map<String, List<TrainConsistApp.Bogie>> result =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("Sleeper", 72)
        );

        Map<String, List<TrainConsistApp.Bogie>> result =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        assertEquals(1, result.size());
        assertTrue(result.containsKey("Sleeper"));
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("Sleeper", 72),
                new TrainConsistApp.Bogie("AC Chair", 50),
                new TrainConsistApp.Bogie("First Class", 30)
        );

        Map<String, List<TrainConsistApp.Bogie>> result =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {

        List<TrainConsistApp.Bogie> list = Arrays.asList(
                new TrainConsistApp.Bogie("Sleeper", 72),
                new TrainConsistApp.Bogie("Sleeper", 70),
                new TrainConsistApp.Bogie("Sleeper", 68)
        );

        Map<String, List<TrainConsistApp.Bogie>> result =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        assertEquals(3, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {

        List<TrainConsistApp.Bogie> list = new ArrayList<>();
        list.add(new TrainConsistApp.Bogie("Sleeper", 72));
        list.add(new TrainConsistApp.Bogie("AC", 50));

        int originalSize = list.size();

        list.stream().collect(Collectors.groupingBy(b -> b.name));

        assertEquals(originalSize, list.size());
    }
}