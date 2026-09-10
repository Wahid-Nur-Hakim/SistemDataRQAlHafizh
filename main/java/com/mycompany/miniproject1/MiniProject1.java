package com.mycompany.miniproject1;

import java.util.Scanner;
import model.CrudUmmi;

public class MiniProject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CrudUmmi crudUmmi = new CrudUmmi(scanner);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\nASSALAMU'ALAIKUM WARAHMATULLAHI WABARAKATUH");
            System.out.println("========= RUMAH QUR'AN Al-Hafizh ==========");
            System.out.println("\n1. Kelola Data Santri");
            System.out.println("2. Kelola Data Kelas Mengaji");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> crudUmmi.kelolaSantri();
                case 2 -> crudUmmi.kelolaKelasMengaji();
                case 3 -> {
                    System.out.println("Syukron Katsiron, Jazakumullah Khair");
                    berjalan = false;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}