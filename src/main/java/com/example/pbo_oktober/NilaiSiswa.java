package com.example.pbo_oktober;

import java.util.Objects;
import java.util.Scanner;

public class NilaiSiswa {
    public static void main (String [] hady){
        Scanner input = new Scanner (System.in);
        String nama , nis;
        String grade = null;
        final double n_tugas , n_uts , n_kuis , n_project , n_akhir;
        System.out.println("===== Menghitung Nilai Siswa=====\n");
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan NIS : ");
        nis = input.nextLine();
        System.out.print("Nilai Tugas : ");
        n_tugas = input.nextInt();
        System.out.print("Nilai Quiz : ");
        n_kuis = input.nextInt();
        System.out.print("Nilai UTS : ");
        n_uts = input.nextInt();
        System.out.print("Nilai Project : ");
        n_project = input.nextInt();
        n_akhir = (0.15 * n_tugas + 0.15 * n_kuis + 0.30 * n_uts + 0.40 * n_project);

        if (n_akhir > 90) {
            grade = String.valueOf('A');
        } else if (n_akhir >= 86) {
            grade = "A-";
        } else if (n_akhir >= 81 && n_akhir <= 85) {
            grade = "B+";
        } else if (n_akhir >= 76 && n_akhir <= 80) {
            grade = String.valueOf('B');
        } else if (n_akhir >= 71 && n_akhir <= 75) {
            grade = "B-";
        } else if (n_akhir >= 66 && n_akhir <= 70) {
            grade = "C+";
        } else if (n_akhir >= 61 && n_akhir <= 65) {
            grade = String.valueOf('C');
        } else if (n_akhir >= 56 && n_akhir <= 60) {
            grade = "C-";
        } else if (n_akhir >= 46 && n_akhir <= 55) {
            grade = String.valueOf('D');
        } else if (n_akhir <= 45) {
            grade = String.valueOf('E');
        }

        if (Objects.equals(grade, "A") || Objects.equals(grade, "A-")){
            System.out.println("============================");
            System.out.println("Nama : " + nama);
            System.out.println("NIS : " + nis);
            System.out.println("Niali Tugas: "+n_tugas);
            System.out.println("Niali Quiz :"+n_kuis);
            System.out.println("Niali UTS : "+n_uts);
            System.out.println("Niali Project : "+n_project);
            System.out.println("Nilai Akhir yang diperoleh yaitu : "+n_akhir);
            System.out.println("Huruf Mutu : "+grade);
            System.out.println("Selamat Anda Lulus");
        }
        else if (Objects.equals(grade, "B+") || Objects.equals(grade, "B") || Objects.equals(grade, "B-")){
            System.out.println("============================");
            System.out.println("Nama : " + nama);
            System.out.println("NIS : " + nis);
            System.out.println("Niali murni Tugas: "+n_tugas);
            System.out.println("Niali murni Quiz :"+n_kuis);
            System.out.println("Niali murni UTS : "+n_uts);
            System.out.println("Niali murni Project : "+n_project);
            System.out.println("Nilai Akhir yang diperoleh yaitu : "+n_akhir);
            System.out.println("Huruf Mutu : "+grade);
            System.out.println("Selamat Anda Lulus");
        }
        else if (Objects.equals(grade, "C+") || Objects.equals(grade, "C") || Objects.equals(grade, "C-")){
            System.out.println("============================");
            System.out.println("Nama : " + nama);
            System.out.println("NIS : " + nis);
            System.out.println("Niali murni Tugas: "+n_tugas);
            System.out.println("Niali murni Quiz :"+n_kuis);
            System.out.println("Niali murni UTS : "+n_uts);
            System.out.println("Niali murni Project : "+n_project);
            System.out.println("Nilai Akhir yang diperoleh yaitu : "+n_akhir);
            System.out.println("Huruf Mutu : "+grade);
            System.out.println("Selamat Anda Lulus");
        }
        else {
            System.out.println("============================");
            System.out.println("Nama : " + nama);
            System.out.println("NIS : " + nis);
            System.out.println("Niali murni Tugas: "+n_tugas);
            System.out.println("Niali murni Quiz :"+n_kuis);
            System.out.println("Niali murni UTS : "+n_uts);
            System.out.println("Niali murni Project : "+n_project);
            System.out.println("Nilai Akhir yang diperoleh yaitu : "+n_akhir);
            System.out.println("Huruf Mutu : "+grade);
            System.out.println("Tidak Lulus");
        }
    }

    /*




    }

     */
}
