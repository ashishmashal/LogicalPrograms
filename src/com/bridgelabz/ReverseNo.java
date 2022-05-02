package com.bridgelabz;

public class ReverseNo {
    public static void main(String[] args) {
        int number=231;
        int remainder=0;
        int reverse=0;
        for(int i=1;i<=3;i++){
            remainder=number%10;
            reverse=(reverse*10)+remainder;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
