package org.example;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
      //  System.out.println(findNumbers(nums));
       // System.out.println(digits(0));
        System.out.println(digit2(-3445432));

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }

    static int digit2(int num){
        if(num < 0){
             num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    //count number of digit in a number
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;

            }
        return count;
    }
}
