package com.Tohsaka.FilmBioskop.Feature;

import java.util.Scanner;

public class Film {
    private static String[] films = new String[0];          // Mendeklarasikan Array tipe String dengan variabel films agar dapat dibaca di method TampilkanFilm

    public static void InputFilm() {                        // Method Untuk Input Daftar Film
        int size;
        System.out.print("Masukkan Jumlah Film: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();                             // Untuk Menentukan Panjang Array berdasarkan Input User
        films = new String[size];                           // Mendeklarasikan Array variabel films dengan ukuran dari variabel size
        for (int i = 0; i < size; i++) {                    // Melakukan Pengisian Elememt Array sesuai dengan ukuran variabel size
            System.out.println("Film Ke-"+(i+1));
            System.out.print("Nama Film: ");
            Scanner daftar = new Scanner(System.in);
            films[i] = daftar.next();                        // Memindahkan isi Array dari variabel daftar ke Array films
        }
        System.out.println("Berhasil Input Film");
        Retry.Ulang();                                      // Method untuk memilih menu yang lain
    }
    public static void TampilkanFilm() {                     // Fungsi Untuk Menampilkan Daftar Film
        System.out.println("Daftar film");
        for (int i = 0; i < films.length; i++) {            // Membaca isi array dari variabel array films
            System.out.println((i+1+". ")+films[i]);
        }
        Retry.Ulang();                                      // Method untuk memilih menu yang lain
    }
    public static void CariFilm(){

    }
}
