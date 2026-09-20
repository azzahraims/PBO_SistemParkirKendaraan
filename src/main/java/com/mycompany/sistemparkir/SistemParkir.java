/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemparkir;

import java.util.Scanner;
import model.Mobil;
import model.Motor;

/**
 *
 * @author user
 */
public class SistemParkir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("         PARKIR KENDARAAN         ");
        System.out.println("==================================");

        System.out.println("Pilih Jenis Kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();

        System.out.print("Nomor Plat : ");
        String nomorPlat = input.nextLine();

        System.out.print("Jam Masuk : ");
        int jamMasuk = input.nextInt();

        System.out.print("Menit Masuk : ");
        int menitMasuk = input.nextInt();

        System.out.print("Jam Keluar : ");
        int jamKeluar = input.nextInt();

        System.out.print("Menit Keluar : ");
        int menitKeluar = input.nextInt();

        if (pilihan == 1) {

            Mobil mobil = new Mobil(
                    nomorPlat,
                    jamMasuk,
                    menitMasuk,
                    jamKeluar,
                    menitKeluar
            );

            mobil.tampilkanHasil();

        } else if (pilihan == 2) {

            Motor motor = new Motor(
                    nomorPlat,
                    jamMasuk,
                    menitMasuk,
                    jamKeluar,
                    menitKeluar
            );

            motor.tampilkanHasil();

        } else {
            System.out.println("Pilihan kendaraan tidak tersedia.");
        }

        input.close();
    }
}