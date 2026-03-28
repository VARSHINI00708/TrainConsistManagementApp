import java.util.*;

public class TrainConsistApp {

    // ========== Bogie Class (Used in UC7) ==========
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

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
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("Total unique bogies: " + bogieIds.size());
        System.out.println("Program continues...\n");
    }

    // ========== USE CASE 4 ==========
    public static void useCase4() {
        System.out.println("=== UC4: Ordered Train Consist (LinkedList) ===");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train:");
        System.out.println(train);

        train.add(2, "Pantry");

        System.out.println("After adding Pantry at position 2:");
        System.out.println(train);

        train.removeFirst();
        train.removeLast();

        System.out.println("After removing first and last bogie:");
        System.out.println(train);

        System.out.println("Final ordered train consist:");
        System.out.println(train);
        System.out.println("Program continues...\n");
    }

    // ========== USE CASE 5 ==========
    public static void useCase5() {
        System.out.println("=== UC5: Train Formation using LinkedHashSet ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // duplicate ignored

        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("Total bogies: " + trainFormation.size());
        System.out.println("Program continues...\n");
    }

    // ========== USE CASE 6 ==========
    public static void useCase6() {
        System.out.println("=== UC6: Bogie Capacity Mapping ===");

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        System.out.println("Program continues...\n");
    }

    // ========== USE CASE 7: Comparator Sorting ==========
    public static void useCase7() {

        System.out.println("=== UC7: Sort Bogies by Capacity ===");

        // Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // Sort using Comparator (ascending by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("After Sorting (Ascending Capacity):");
        System.out.println(bogies);

        System.out.println("Program continues...\n");
    }

    public static void main(String[] args) {
        useCase1();
        useCase2();
        useCase3();
        useCase4();
        useCase5();
        useCase6();
        useCase7(); // Final UC
    }
}