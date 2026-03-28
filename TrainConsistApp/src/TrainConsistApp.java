import java.util.*;

public class TrainConsistApp {

    // ========== USE CASE 1: Initialize Train and Display Consist Summary ==========
    public static void useCase1() {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("Program continues...");
    }

    public static void main(String[] args) {
        useCase1(); // calling UC1
    }
}