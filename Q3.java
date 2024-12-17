import java.util.*;

class Q3 {
    public static String maxFrequency(String[] array) {
        if (array == null || array.length == 0) {
            return "Invalid Array";
        }
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String item : array)
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        return frequencyMap.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static void main(String[] args) {
        String[] array = {"apple","pie","apple","red","red","red"};
        System.out.println(maxFrequency(array));
    }
}