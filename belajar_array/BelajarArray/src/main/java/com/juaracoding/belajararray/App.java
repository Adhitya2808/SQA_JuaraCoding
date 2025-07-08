package com.juaracoding.belajararray;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah anggota : "+scan);
        int size = scan.nextInt();
        int[] nama = new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("Anggota Ke -"+(i+1)+"= ");
            nama[i]=scan.nextInt();
        }
        System.out.println("Hasil Akhir Array :");
        for(int i : nama) {
            System.out.print(i + " ");
        }
        System.out.println();
        scan.close();
    }
}
