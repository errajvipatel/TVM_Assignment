class Q2 {
    public static void floorDivision(int N) {
        if (N == 1 || N==-1 || N==0)
            return;
        floorDivision(N/2);
        System.out.println(N);
    }
    public static void main(String[] args) {
        int input = 9;
        floorDivision(input);
    }
}
