import java.util.*;

class Search{

    public int find(int[] array, int tar){
    
        for(int i = 0; i<array.length; i++){
            int start = 0;
            int end = array.length-1;
        int mid = start + end;
        if(array[mid] == tar){
            System.out.println("found " + array[mid] + " at index " + mid);
        }
        else if(array[mid] > tar){
            start = mid;

        }
        else if(array[mid] < tar){
            end = mid;
        }
        }
    }
    

}

class binarySearch{
    public static void main(String[] args){
        int[] arr = {21, 60, 31, 89, 94, 23, 46, 12, 56};
        int target = 31;
        Search sc = new Search();
        System.out.println(sc.find(arr, target));;
    }
}