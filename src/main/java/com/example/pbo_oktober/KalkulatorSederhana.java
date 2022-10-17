package com.example.pbo_oktober;

import javax.swing.*;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        float hasil, a, b;

        while (true){

            // tampilkan menu
            String pilihan = JOptionPane.showInputDialog("""
                    Pilih Menu:
                    1. Tambah
                    2. Kurang
                    3. Kali
                    4. Bagi
                    5. Pembulatan (div)
                    6. Sisa Bagi (mod)
                    7. Keluar""");


            switch (pilihan) {
                case "1" -> {
                    a = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan pertama : "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan kedua : "));
                    hasil = a + b;
                    JOptionPane.showMessageDialog(null, "Hasil dari " + a + " + " + b + " = " + hasil);
                }
                case "2" -> {
                    a = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan pertama : "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan kedua : "));
                    hasil = a - b;
                    JOptionPane.showMessageDialog(null, "Hasil dari " + a + " - " + b + " = " + hasil);
                }
                case "3" -> {
                    a = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan pertama : "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan kedua : "));
                    hasil = a * b;
                    JOptionPane.showMessageDialog(null, "Hasil dari " + a + " * " + b + " = " + hasil);
                }
                case "4" -> {
                    a = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan pertama : "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan kedua : "));
                    hasil = a / b;
                    JOptionPane.showMessageDialog(null, "Hasil dari " + a + " / " + b + " = " + hasil);
                }
                case "5" -> {
                    a = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan pertama : "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan kedua : "));
                    hasil = a / b;
                    JOptionPane.showMessageDialog(null, "Hasil dari " + a + " / " + b + " = "+Math.round(hasil));
                }
                case "6" -> {
                    a = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan pertama : "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan kedua : "));
                    hasil = a % b;
                    JOptionPane.showMessageDialog(null, "Hasil dari " + a + " / " + b + " = " + hasil);
                }
                case "7" -> {
                    String yakin = JOptionPane.showInputDialog("""
                            Yakin ingin keluar?
                            1. Ya
                            2. Tidak""");
                    if (yakin.equals("1")) {
                        System.exit(0);
                    }
                }
                default -> JOptionPane.showMessageDialog(null, "Pilihan '" + pilihan + "' tidak ada!");
            }


        }

    }

}
