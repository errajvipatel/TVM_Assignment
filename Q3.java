import java.util.*;

class Q3 {
    public static String maxFrequency(String[] array) {
        // Handle edge cases where the input array is null or empty
        if (array == null || array.length == 0) {
            return "Invalid Array"; 
        }

        // HashMap to store the frequency of each string in the array
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        
        for (String item : array) {
            // Increment the count for the current string (default is 0 if not present)
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static void main(String[] args) {
        String[] array = {"apple", "pie", "apple", "red", "red", "red"};
        
        System.out.println(maxFrequency(array)); // Output: "red"
    }
}
