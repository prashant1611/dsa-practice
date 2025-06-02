package dsa.searching.linearsearch;

public class FindMinElement {
    public static void main(String[] args) {
        int [] arr = {45,78,90,2,-56,78};
        System.out.println("minimum value in the array "+minElement(arr));

    }
    public static int minElement(int [] arr){
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
