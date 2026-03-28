import java.util.*;

public class TrainConsistApp {

    // ========== USE CASE 1 ==========
    public static void useCase1() {

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("Program continues...\n");
    }

    // ========== USE CASE 2 ==========
    public static void useCase2() {

        System.out.println("=== UC2: Passenger Bogie Management ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        }

        System.out.println("Final bogie list:");
        System.out.println(passengerBogies);

        System.out.println("Program continues...\n");
    }

    // ========== USE CASE 3 ==========
    public static void useCase3() {

        System.out.println("=== UC3: Unique Bogie ID Tracking ===");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("Total unique bogies: " + bogieIds.size());

        System.out.println("Program continues...\n");
    }

    // ========== USE CASE 4: Ordered Train using LinkedList ==========
    public static void useCase4() {

        System.out.println("=== UC4: Ordered Train Consist (LinkedList) ===");

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train:");
        System.out.println(train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("After adding Pantry at position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("After removing first and last bogie:");
        System.out.println(train);

        System.out.println("Final ordered train consist:");
        System.out.println(train);

        System.out.println("Program continues...\n");
    }

    public static void main(String[] args) {
        useCase1();
        useCase2();
        useCase3();
        useCase4(); // Added UC4
    }
}