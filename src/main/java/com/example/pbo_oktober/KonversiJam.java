package com.example.pbo_oktober;

import java.util.Scanner;

public class KonversiJam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j,m,d,total;
        System.out.println("Jam : ");
        j = in.nextInt();
        System.out.println("Menit : ");
        m = in.nextInt();
        System.out.println("Detik : ");
        d = in.nextInt();
        total = j * 3600 + m * 60 + d;
        System.out.println("Total detik = "+total);
    }
}
