package dsa.searching.linearsearch;

public class EvenNoOfDigit {
    public static void main(String[] args) {
        int [] arr = {34, 56, 2, 56, 7895, 23, 0, -4567};
        System.out.println("count of even number digit "+countOfEvenDigit(arr));
    }
    public static int countOfEvenDigit(int[] arr){
        int count = 0;
        for(int num : arr){
            if(event(num)){
                count++;
            }
        }
        return count;
    }

    //check a number have event number or digit or not
    static boolean event(int num) {
        if(num<0){
            num = num * -1;
        }
        if (num == 0) {
            return false;
        }
        int digitCount = 0;
        while(num>0){
            digitCount++;
            num = num/10;
        }
        return digitCount % 2 == 0;
    }
}
