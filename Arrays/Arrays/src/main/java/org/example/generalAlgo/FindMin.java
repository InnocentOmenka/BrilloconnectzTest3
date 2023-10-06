package org.example;

public class FindMin {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8, 5, 98};
        System.out.println(min(arr));

    }

    static int min(int [] arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i] < ans ){
                ans = arr[i];
            }
        }
        return ans;
    }
}
