package com.bridgelabz;

public class PrimeNo {
    public static void main(String[] args) {
        int flag=0;
        //n is number to be checked
        int n=7;
        int m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  {
                System.out.println(n+" is prime number");
            }
        }
    }
}
