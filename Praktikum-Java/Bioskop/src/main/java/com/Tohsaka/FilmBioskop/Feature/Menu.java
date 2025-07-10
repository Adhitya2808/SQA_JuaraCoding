package com.Tohsaka.FilmBioskop.Feature;
import java.util.Scanner;

public class Menu {
    protected static void TampilkanMenu(){                     // Method Untuk Menampilkan Daftar Menu
        System.out.println("=== Menu Utama ===");
        System.out.println("1. Tampilkan Daftar Film");
        System.out.println("2. Input Data Film");
        System.out.println("3. Cari Film");
        System.out.println("4. Keluar");
        Scanner menu = new Scanner(System.in);
        System.out.print("Pilih : "+menu);

        switch (menu.nextInt()){                           // Percabangan Untuk Menentukan Menu Apa Yang Dipilih oleh user
            case 1:
                Film.tampilkanfilm();                      // method Untuk Menampilkan Daftar Film
                break;
            case 2:
                Film.inputfilm();                          // method Untuk Memasukkan Nama Film
                break;
            case 3:
                Film.carifilm();                           // method Untuk Mencari Daftar Film
                break;
            case 4:
                System.out.println("Anda Telah Logout");
                Logout.keluar();                          // method Untuk Logout/Keluar
                break;
            default:
                System.out.println("Input Error");
                Retry.ulang();                           // method Untuk Mengulang Pilihan
                break;
        }
    }
}
