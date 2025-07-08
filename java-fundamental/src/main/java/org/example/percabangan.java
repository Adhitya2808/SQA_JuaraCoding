package org.example;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        int batas;
        Scanner sc=new Scanner(System.in);
        System.out.println("tentukan batas : "+ sc);
        batas=sc.nextInt();
        for(int i=0;i<=batas;i++){
            if (i%2==0){
                System.out.println("genap = "+i);
            }
            else{
                System.out.println("ganjil = "+i);
            }
        }

        //seigitiga
        for (int i=0;i<=batas;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}