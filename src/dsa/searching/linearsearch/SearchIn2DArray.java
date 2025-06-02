package dsa.searching.linearsearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {45,23,78,99,34},
                {6,89,34,12,78},
                {45,12,54,75}
        };
        int target = 75;
//        System.out.println("search in 2d array "+ Arrays.toString(searchIn2DArray(arr, target)));
        System.out.println("max value "+max(arr));

    }
    static int[] searchIn2DArray(int[][] arr, int target){
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                if (anInt == target) {
//                    return target;
//                }
//            }
//        }
        for(int row = 0 ; row < arr.length ;row++){
            for(int col = 0 ; col<arr[row].length ; col++){
                if(target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[]arr1:arr){
            for(int element : arr1){
                if(element>max){
                    max = element;
                }
            }
        }
            return max;
    }
}
