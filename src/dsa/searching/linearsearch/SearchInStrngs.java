package dsa.searching.linearsearch;

public class SearchInStrngs {
    public static void main(String[] args) {
        String name = "simple";
        char target = 'e';
        System.out.println("finding the char in string "+stringSearch(name,target));
        System.out.println("finding the char in string using foreach "+stringSearch2(name,target));

    }
    public static boolean stringSearch(String name, char target){
        if(name.isEmpty()){
            return false;
        }
        for(int i = 0 ;i<name.length();i++){
            if(target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //function to use for each to iterate
    public static boolean stringSearch2(String name , char target){
        if(name.isEmpty()){
            return false;
        }

        for (char t : name.toCharArray()){
            if(t==target){
                return true;
            }
        }
        return false;
    }
}
