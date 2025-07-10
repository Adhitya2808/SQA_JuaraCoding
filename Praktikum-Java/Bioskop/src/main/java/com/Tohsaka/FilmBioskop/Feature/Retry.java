package com.Tohsaka.FilmBioskop.Feature;

import java.util.Scanner;

public class Retry {
    private static String ulang;
    protected static void ulang(){                            // Method Untuk Mengulang Pilihan
        System.out.print("Apakah anda ingin Memilih Menu Lain?(ya/tidak) : ");
        Scanner input = new Scanner(System.in);
        ulang = input.nextLine();

        if(ulang.equalsIgnoreCase("ya")||ulang.equalsIgnoreCase("iya")){      // Jika User Memilih ya atau iya maka akan kembali ke daftar menu
            Menu.TampilkanMenu();
        } else if(ulang.equalsIgnoreCase("tidak")){        // jika user memilih tidak maka akan Logout atau keluar
            Logout.keluar();
        } else{
            System.out.println("Input Error");             // jika user tidak memilih salah satu maka akan error input dan mengulang hingga inputan benar
            ulang();
        }
    }
}