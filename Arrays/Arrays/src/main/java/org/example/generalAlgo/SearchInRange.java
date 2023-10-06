package org.example;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {14, 45, 67, 23, 44, 8, 67, 78};
        int target = 60;
        System.out.println(linearSearch(arr, target, 1, 5 ));

    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index<=end; index++){
            //check for element at every index if it is == target
            int element = arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;
    }
}
