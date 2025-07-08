package org.example;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        String NamaLengkap;
        String Password;
        String Email;
        boolean verif = false;
        String Telephone;
        String Address;

        Scanner Nama = new Scanner(System.in);
        NamaLengkap = Nama.next();
        System.out.printf("Nama Lengkap = "+ NamaLengkap);
        Scanner email = new Scanner(System.in);
        Email = email.next();
        System.out.printf("Email = "+ Email);
        Scanner password = new Scanner(System.in);
        Password = password.next();
        System.out.printf("Password = "+ Password);
        Scanner telephone = new Scanner(System.in);
        Telephone = telephone.next();
        System.out.printf("Telephone = "+ Telephone);
        Scanner address = new Scanner(System.in);
        Address = address.next();
        System.out.printf("Address = "+ Address);
        }
    }