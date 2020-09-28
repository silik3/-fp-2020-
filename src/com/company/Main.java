package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Aleksandrs Silibitkins 4.gr 181RDB276");
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        System.out.println("Your number: "+number);
        detect(number);
    }

    public static void detect(int n) {

        int sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum+=i;
                    System.out.println(i);

                }
            }
        System.out.println("============");
            if(sum>n){
                System.out.println( sum +" > "+n +"  :number is abudant");
            }else if(sum<n){
                System.out.println( sum +" < "+n +"  :number is deficient");

        }else{
                System.out.println( sum +"="+n +"  :number is perfect");
            }

    }
}
