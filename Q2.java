class Q2 {
    // This method performs recursive floor division by 2 and prints the intermediate values
    public static void floorDivision(int N) {
        // Exception case: if N is 1, -1, or 0, the recursion stops
        if (N == 1 || N == -1 || N == 0)
            return;
        
        // Recursive call: divide N by 2 (integer division)
        floorDivision(N / 2);
        
        // Print the current value of N after all recursive calls have returned
        System.out.println(N);
    }
    
    public static void main(String[] args) {
        int input = 9;
        
        // Call the floorDivision method with the input value
        floorDivision(input);
    }
}
