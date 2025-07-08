package org.example;

import java.util.Scanner;

public class stock {
    public static void main(String[] args) {
        int Stock, jumlah, price, minreq,disc,jdisc,potongan,potongan2,total,ekspedisi;
        int HargaEkspedisi = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Stock: "+input);
        Stock = input.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Input Total Order: "+b);
        jumlah = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Input Minimum Order: "+c);
        minreq = c.nextInt();
        Scanner d = new Scanner(System.in);
        System.out.println("Input price: "+d);
        price = d.nextInt();
        Scanner e = new Scanner(System.in);
        System.out.println("Input discount(%): "+e);
        disc = e.nextInt();
        Scanner f = new Scanner(System.in);
        System.out.println("Input Minimum order Criteria for discount : "+f);
        jdisc = f.nextInt();

        //Stock//
        if (Stock >= 1) {
            if(jumlah <= Stock) {
                System.out.println("Stock Available");
                if (jumlah >= minreq) {
                    System.out.println("Successfully add to cart");
                    System.out.println("Price 1 Item: "+price);
                } if (jumlah >= jdisc) {
                    potongan = price*(disc/100);
                    total = jumlah*price;
                    potongan2 = total-potongan;
                    System.out.println("Congratulations! You have discount "+disc+"%");
                    System.out.println("Total Price: "+potongan2);

                    //ekspedisi
                    Scanner Ekspeisi = new Scanner(System.in);
                    System.out.println("Input Type Ekspedisi : "+Ekspeisi);
                    ekspedisi = Ekspeisi.nextInt();
                    switch(ekspedisi){
                        case 1:
                            System.out.println("You Choose Cargo");
                            HargaEkspedisi = 15000;
                            System.out.println("Harga Ekspedisi: "+HargaEkspedisi);
                            break;
                        case 2:
                            System.out.println("You Choose Sameday");
                            HargaEkspedisi = 50000;
                            System.out.println("Harga Ekspedisi: "+HargaEkspedisi);
                            break;
                        case 3:
                            System.out.println("You Choose Nextday");
                            HargaEkspedisi = 30000;
                            System.out.println("Harga Ekspedisi: "+HargaEkspedisi);
                            break;
                        case 4:
                            System.out.println("You Choose Regular");
                            HargaEkspedisi = 20000;
                            System.out.println("Harga Ekspedisi: "+HargaEkspedisi);
                            break;
                        default:
                            System.out.println("Invalid Input");
                            
                    }
                } else {
                    System.out.println("Total Price: "+jumlah*price);

                    //ekspedisi
                    Scanner Ekspeisi = new Scanner(System.in);
                    System.out.println("Input Type Ekspedisi : "+Ekspeisi);
                    ekspedisi = Ekspeisi.nextInt();
                    switch(ekspedisi){
                        case 1:
                            System.out.println("You Choose Cargo");
                            HargaEkspedisi = 15000;
                            System.out.println("Harga Ekspedisi: "+HargaEkspedisi);
                            break;
                        case 2:
                            System.out.println("You Choose Sameday");
                            HargaEkspedisi = 50000;
                            System.out.println("Harga Ekspedisi: "+HargaEkspedisi);
                            break;
                        case 3:
                            System.out.println("You Choose Nextday");
                            HargaEkspedisi = 30000;
                            System.out.println("Harga Ekspedisi: "+HargaEkspedisi);
                            break;
                        case 4:
                            System.out.println("You Choose Regular");
                            HargaEkspedisi = 20000;
                            System.out.println("Harga Ekspedisi: "+HargaEkspedisi);
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                }
            }else{
                System.out.println("Failed Add to Cart, Minimum Order is " + minreq);
            }
        } else{
            System.out.println("Stock Not Available");
        }
    }
}