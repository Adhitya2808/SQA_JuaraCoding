package com.Tohsaka.FilmBioskop.Feature;

import java.util.Scanner;

public class Login {
    private static String user,pass;

    public static void login() {                            //Method Untuk Login
        System.out.println("=== Login ===");
        Scanner username = new Scanner(System.in);
        System.out.print("Username : ");         // Masukkan Username
        user = username.nextLine();
        Scanner password = new Scanner(System.in);
        System.out.print("Password : ");         // Masukkan Password
        pass = password.nextLine();

        if (user.equals("admin") && pass.equals("12345")) { // Untuk mengecek apakah username = admin dan password = 12345
            System.out.println("Login Berhasil!");
            Menu.TampilkanMenu();                          // Jika benar maka akan memanggil Daftar Menu
        } else {
            System.out.println("Login Gagal!");
            Logout.keluar();                              // Jika salah maka akan keluar
        }
    }
}
