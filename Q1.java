import java.util.*;

class Q1 {
    // Method to count the number of occurrences of 'a' or 'A' in a given word
    public static int count(String word) {
        return (int) word.chars().filter(c -> c == 'a' || c == 'A').count();
    }

    public static List<String> sortArray(List<String> array) {
        Collections.sort(array, (str1, str2) -> {
            int count1 = count(str1);
            int count2 = count(str2);

            // If counts of 'a' or 'A' are equal, sort by string length in descending order
            return count1 != count2 ? (count2 - count1) : (str2.length() - str1.length());
        });
        return array;
    }

    public static void main(String[] args) {
        List<String> array = Arrays.asList(
            "aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc",
            "lklklklklklklklkl", "l"
        );

        System.out.println(sortArray(array));
    }
}
