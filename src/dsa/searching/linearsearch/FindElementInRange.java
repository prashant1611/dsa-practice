package dsa.searching.linearsearch;

public class FindElementInRange {
    public static void main(String[] args) {
        int [] arr = {35,67,34,78,89,90};
        int target = 78;
        System.out.println("find element in range "+findInRange(arr, target, 2,4));
    }
    public static int findInRange(int [] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start ; i<= end; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
