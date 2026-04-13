import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class TrainConsistAppTest {

    // 🔹 1. Basic Sorting
    @Test
    void testSort_BasicAlphabeticalSorting() {

        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};

        Arrays.sort(input);

        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        assertArrayEquals(expected, input);
    }

    // 🔹 2. Unsorted Input
    @Test
    void testSort_UnsortedInput() {

        String[] input = {"Luxury","General","Sleeper","AC Chair"};

        Arrays.sort(input);

        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        assertArrayEquals(expected, input);
    }

    // 🔹 3. Already Sorted
    @Test
    void testSort_AlreadySortedArray() {

        String[] input = {"AC Chair","First Class","General"};

        String[] original = input.clone();

        Arrays.sort(input);

        assertArrayEquals(original, input);
    }

    // 🔹 4. Duplicate Values
    @Test
    void testSort_DuplicateBogieNames() {

        String[] input = {"Sleeper","AC Chair","Sleeper","General"};

        Arrays.sort(input);

        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        assertArrayEquals(expected, input);
    }

    // 🔹 5. Single Element
    @Test
    void testSort_SingleElementArray() {

        String[] input = {"Sleeper"};

        Arrays.sort(input);

        String[] expected = {"Sleeper"};

        assertArrayEquals(expected, input);
    }
}