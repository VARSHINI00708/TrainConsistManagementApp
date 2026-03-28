import java.util.*;

public class TrainConsistApp {

    // ========== USE CASE 1: Initialize Train ==========
    public static void useCase1() {

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("Program continues...\n");
    }

    // ========== USE CASE 2: Add Passenger Bogies ==========
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

    // ========== USE CASE 3: Unique Bogie IDs using HashSet ==========
    public static void useCase3() {

        System.out.println("=== UC3: Unique Bogie ID Tracking ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("Total unique bogies: " + bogieIds.size());

        System.out.println("Program continues...\n");
    }

    public static void main(String[] args) {
        useCase1();
        useCase2();
        useCase3(); // Added UC3
    }
}