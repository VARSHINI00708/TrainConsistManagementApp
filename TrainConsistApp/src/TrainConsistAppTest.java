import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
public class TrainConsistAppTest {

    // 🔹 1. Valid Train ID
    @Test
    void testRegex_ValidTrainID() {
        assertTrue(TrainConsistApp.validateTrainId("TRN-1234"));
    }

    // 🔹 2. Invalid Train ID
    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(TrainConsistApp.validateTrainId("TRAIN12"));
        assertFalse(TrainConsistApp.validateTrainId("TRN12A"));
        assertFalse(TrainConsistApp.validateTrainId("1234-TRN"));
    }

    // 🔹 3. Valid Cargo Code
    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(TrainConsistApp.validateCargoCode("PET-AB"));
    }

    // 🔹 4. Invalid Cargo Code
    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(TrainConsistApp.validateCargoCode("PET-ab"));
        assertFalse(TrainConsistApp.validateCargoCode("PET123"));
        assertFalse(TrainConsistApp.validateCargoCode("AB-PET"));
    }

    // 🔹 5. Train ID digit length
    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(TrainConsistApp.validateTrainId("TRN-123"));
        assertFalse(TrainConsistApp.validateTrainId("TRN-12345"));
    }

    // 🔹 6. Cargo uppercase only
    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(TrainConsistApp.validateCargoCode("PET-Ab"));
        assertFalse(TrainConsistApp.validateCargoCode("PET-aB"));
    }

    // 🔹 7. Empty input
    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(TrainConsistApp.validateTrainId(""));
        assertFalse(TrainConsistApp.validateCargoCode(""));
    }

    // 🔹 8. Exact pattern match
    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(TrainConsistApp.validateTrainId("TRN-1234XYZ"));
        assertFalse(TrainConsistApp.validateCargoCode("PET-AB12"));
    }
}