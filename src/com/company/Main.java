package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int sayi = scanner.nextInt();
        double toplam = 0.0;

        for (double i=1;i<=sayi;i++){
            toplam += (1/i);
        }
        System.out.println(toplam);
    }
}
