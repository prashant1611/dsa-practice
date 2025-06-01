package dsa.searching.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {3,5,34,78,90};
        int target = 33;
        System.out.println("linearSearch for "+target+" at index = "+linearSearch(arr,target));
        System.out.println("return element if present "+linearSearch1(arr, target));
        System.out.println("return boolean value  if present or not  "+linearSearch2(arr, target));
    }

    //search the target and return the index
    public static int linearSearch(int []arr, int target ){
        if(arr.length==0){
            return -1;
        }
        for(int i=0 ;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // search the target and return the element
    public static int linearSearch1(int []arr, int target ){
        for (int j : arr) {
            if (j == target) {
                return target;
            }
        }
        return Integer.MAX_VALUE;
    }

    //search the target if present then send true if not then false
    public static boolean linearSearch2(int[] arr,int target){
        for (int j : arr) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }
}
