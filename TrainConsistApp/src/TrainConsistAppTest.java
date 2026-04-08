import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class TrainConsistAppTest {

    // ✅ 1. All valid
    @Test
    void testSafety_AllBogiesValid() {

        List<TrainConsistApp.GoodsBogie> list = Arrays.asList(
                new TrainConsistApp.GoodsBogie("Cylindrical", "Petroleum"),
                new TrainConsistApp.GoodsBogie("Open", "Coal")
        );

        boolean result = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        assertTrue(result);
    }

    // ❌ 2. Cylindrical with wrong cargo
    @Test
    void testSafety_CylindricalWithInvalidCargo() {

        List<TrainConsistApp.GoodsBogie> list = Arrays.asList(
                new TrainConsistApp.GoodsBogie("Cylindrical", "Coal")
        );

        boolean result = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        assertFalse(result);
    }

    // ✅ 3. Non-cylindrical allowed
    @Test
    void testSafety_NonCylindricalBogiesAllowed() {

        List<TrainConsistApp.GoodsBogie> list = Arrays.asList(
                new TrainConsistApp.GoodsBogie("Open", "Coal"),
                new TrainConsistApp.GoodsBogie("Box", "Grain")
        );

        boolean result = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        assertTrue(result);
    }

    // ❌ 4. Mixed violation
    @Test
    void testSafety_MixedBogiesWithViolation() {

        List<TrainConsistApp.GoodsBogie> list = Arrays.asList(
                new TrainConsistApp.GoodsBogie("Cylindrical", "Petroleum"),
                new TrainConsistApp.GoodsBogie("Cylindrical", "Coal")
        );

        boolean result = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        assertFalse(result);
    }

    // ✅ 5. Empty list
    @Test
    void testSafety_EmptyBogieList() {

        List<TrainConsistApp.GoodsBogie> list = new ArrayList<>();

        boolean result = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        assertTrue(result);
    }
}