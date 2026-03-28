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

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Final state
        System.out.println("Final bogie list:");
        System.out.println(passengerBogies);

        System.out.println("Program continues...\n");
    }

    public static void main(String[] args) {
        useCase1();
        useCase2(); // Added UC2
    }
}