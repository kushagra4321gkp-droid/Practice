import java.util.*;

class Search{

    public int find(int[] arr, int tar){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == tar){
                return i;
            }
        }

        return -1;

    }

}

class linearSearch{

    public static void main(String[] args){

        int[] series = {4, 6, 1, 9, 5, 8};
        int target = 6;
        Search sc = new Search();
        int result = sc.find(series, target);
        System.out.println(result);

    }

}