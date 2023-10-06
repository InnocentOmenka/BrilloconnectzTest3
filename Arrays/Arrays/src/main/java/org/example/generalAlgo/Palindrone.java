package org.example;

public class Palindrone {
    public static void main(String[] args) {
        System.out.println(isPalindrone("inni"));

    }

    public static boolean isPalindrone(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i>=0; i--){
            builder.append(str.charAt(i));
        }
        return str.equals(builder.toString());
    }
}
