package com.Tohsaka.FilmBioskop.Feature;

import java.util.Scanner;

public class Film {
    private static String[] films = new String[0];          // Mendeklarasikan Array tipe String dengan variabel films agar dapat dibaca di method TampilkanFilm
    private static int size;

    protected static void inputfilm() {                               // Method Untuk Input Daftar Film
        System.out.print("Masukkan Jumlah Film: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();                             // Untuk Menentukan Panjang Array berdasarkan Input User
        films = new String[size];                           // Mendeklarasikan Array variabel films dengan ukuran dari variabel size

        if(size <=10){                                      // Maksimal Input Film adalah 10
            for (int i = 0; i < size; i++) {                // Melakukan Pengisian Elememt Array sesuai dengan ukuran variabel size
                System.out.println("Film Ke-"+(i+1));
                System.out.print("Nama Film: ");
                Scanner daftar = new Scanner(System.in);
                films[i] = daftar.nextLine();                   // Memindahkan isi Array dari variabel daftar ke Array films
            }
            System.out.println("Berhasil Input Film");
        } else{
            System.out.println("Maksimal Input Film Adalah 10"); // jika jumlah film lebih dari 10
        }
        Retry.ulang();                                      // Method untuk memilih menu yang lain
    }
    protected static void tampilkanfilm() {                           // Fungsi Untuk Menampilkan Daftar Film
        System.out.println("Daftar film");

        if(films.length == 0){
            System.out.println("Tidak ada film yang tersedia");
        }
        for (int i = 0; i < films.length; i++) {            // Membaca isi array dari variabel array films
            System.out.println((i+1+". ")+films[i]);
        }
        Retry.ulang();                                      // Method untuk memilih menu yang lain
    }
    protected static void carifilm(){                                 // Method Untuk Mencari Judul film
        System.out.println("===Mencari Judul Film===");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Judul Film: ");        // Input dari User untuk mencari film
        String judul = input.nextLine();
        boolean cari = false;
        for(int i = 0; i < films.length; i++){              // Membaca Isi array
            if(films[i].toLowerCase().contains(judul.toLowerCase())){       // mencocokkan input user dengan isi array films
                System.out.println((i+1+". ")+films[i]);
                cari = true;
            }
        }
        if(!cari){                                          // Jika input user tidak ada yang sama dari isi array films
            System.out.println("Tidak ditemukan film dengan Judul : "+judul);
        }
        Retry.ulang();                                    // Method untuk memilih menu yang lain
    }
}
