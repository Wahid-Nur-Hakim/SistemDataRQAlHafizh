package model;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudUmmi {
    private ArrayList<Santri> daftarSantri;
    private ArrayList<KelasMengaji> daftarKelas;
    private Scanner scanner;

    public CrudUmmi(Scanner scanner) {
        this.daftarSantri = new ArrayList<>();
        this.daftarKelas = new ArrayList<>();
        this.scanner = scanner;

        daftarKelas.add(new KelasMengaji(1, "UMMI 1", "Ibu Ana", 30));
        daftarKelas.add(new KelasMengaji(2, "UMMI 2", "Ibu Fatimah", 30));
        daftarKelas.add(new KelasMengaji(3, "UMMI 3", "Ibu Hajrah", 30));
        daftarKelas.add(new KelasMengaji(4, "UMMI 4", "Ibu Alya", 30));
        daftarKelas.add(new KelasMengaji(5, "UMMI 5", "Ibu Khansa", 30));
        daftarKelas.add(new KelasMengaji(6, "UMMI 6", "Ibu Gita", 30));
    }

    public void kelolaSantri() {
        boolean kembali = true;
        while (kembali) {
            System.out.println("\n==== Menu Santri ====");
            System.out.println("1. Tambah Santri");
            System.out.println("2. Lihat Data Santri");
            System.out.println("3. Hapus Santri");
            System.out.println("4. Update Kelas Santri");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Input pake angka bosss");
                scanner.nextLine();
                continue;
            }
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahSantri();
                case 2 -> tampilkanSantri();
                case 3 -> hapusSantri();
                case 4 -> updateKelasSantri();
                case 5 -> kembali = false;
                default -> System.out.println("Pilihan tidak valid!!!!!!!!!!!");
            }
        }
    }

    public void kelolaKelasMengaji() {
        boolean kembali = true;
        while (kembali) {
            System.out.println("\n==== Menu Kelas Mengaji ====");
            System.out.println("1. Tambah Kelas Mengaji");
            System.out.println("2. Lihat Data Kelas Mengaji");
            System.out.println("3. Hapus Kelas Mengaji");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Input harus angkaaa");
                scanner.nextLine();
                continue;
            }
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahKelasMengaji();
                case 2 -> tampilkanKelasMengaji();
                case 3 -> hapusKelasMengaji();
                case 4 -> kembali = false;
                default -> System.out.println("Pilihan tidak valid!!!");
            }
        }
    }

    private void tambahSantri() {
        String nama;
        int umur;
        String noTelpWali;
        int pilihanKelas;

        while (true) {
            System.out.print("\nNama Santri: ");
            nama = scanner.nextLine();
            if (!nama.isEmpty()) {
                break;
            }
            System.out.println("Nama tidak boleh kosong yaaa!!");
        }

        // Input umur (loop sampai valid)
        while (true) {
            System.out.print("Umur (5-17 tahun): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Umur pake angkaa");
                scanner.nextLine();
                continue;
            }
            umur = scanner.nextInt();
            scanner.nextLine();
            if (umur >= 5 && umur <= 17) {
                break;
            }
            System.out.println("Umur santri diisi antara 5 sampai 17 tahun");
        }

        while (true) {
            System.out.print("No. Telepon Wali: ");
            noTelpWali = scanner.nextLine();
            if (!noTelpWali.isEmpty()) {
                break;
            }
            System.out.println("No. telepon wali tidak boleh kosong guysss");
        }

        while (true) {
            tampilkanKelasMengaji();
            System.out.print("Pilih kode kelas (1-6): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Input pake angkaa yaa");
                scanner.nextLine();
                continue;
            }
            pilihanKelas = scanner.nextInt();
            scanner.nextLine();
            if (pilihanKelas >= 1 && pilihanKelas <= daftarKelas.size()) {
                break;
            }
            System.out.println("Kode kelas tidak valid, dilihat lagi kodenyaa");
            continue;
        }

        KelasMengaji kelasDipilih = daftarKelas.get(pilihanKelas - 1);
        daftarSantri.add(new Santri(nama, umur, noTelpWali, kelasDipilih));
        System.out.println("Data santri berhasil ditambahkan");
    }

    private void tampilkanSantri() {
        if (daftarSantri.isEmpty()) {
            System.out.println("\nBelum ada data santri.");
            return;
        }
        System.out.println("\n=== Data Santri RQ Al-Hafizh ===");
        System.out.println(Santri.getHeader());
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < daftarSantri.size(); i++) {
            System.out.printf("%-4d | %s%n", i + 1, daftarSantri.get(i));
        }
    }

    private void hapusSantri() {
        if (daftarSantri.isEmpty()) {
            System.out.println("\nBelum ada data santri");
            return;
        }
        tampilkanSantri();
        
        int nomor;
        while (true) {
            System.out.print("Masukkan nomor santri yang akan dihapus: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka");
                scanner.nextLine();
                continue;
            }
            nomor = scanner.nextInt();
            scanner.nextLine();
            if (nomor >= 1 && nomor <= daftarSantri.size()) {
                break;
            }
            System.out.println("Nomor santri tidak valid");
        }
        
        daftarSantri.remove(nomor - 1);
        System.out.println("Data santri berhasil dihapus");
    }

    private void updateKelasSantri() {
        if (daftarSantri.isEmpty()) {
            System.out.println("\nBelum ada data santri");
            return;
        }
        tampilkanSantri();
        
        int nomorSantri;
        while (true) {
            System.out.print("Masukkan nomor santri: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka");
                scanner.nextLine();
                continue;
            }
            nomorSantri = scanner.nextInt();
            scanner.nextLine();
            if (nomorSantri >= 1 && nomorSantri <= daftarSantri.size()) {
                break;
            }
            System.out.println("Nomor santri tidak valid");
        }

        int nomorKelas;
        while (true) {
            tampilkanKelasMengaji();
            System.out.print("Pilih kode kelas baru (1-6): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka");
                scanner.nextLine();
                continue;
            }
            nomorKelas = scanner.nextInt();
            scanner.nextLine();
            if (nomorKelas >= 1 && nomorKelas <= daftarKelas.size()) {
                break;
            }
            System.out.println("Kode kelas tidak valid");
        }

        daftarSantri.get(nomorSantri - 1).setKelasMengaji(daftarKelas.get(nomorKelas - 1));
        System.out.println("Kelas santri berhasil diupdate");
    }

    private void tambahKelasMengaji() {
        String namaKelas;
        String pengajar;
        int kapasitas;

        while (true) {
            System.out.print("\nNama Kelas Mengaji: ");
            namaKelas = scanner.nextLine();
            if (!namaKelas.isEmpty()) {
                break;
            }
            System.out.println("Nama kelas tidak boleh kosong");
        }

        while (true) {
            System.out.print("Nama Pengajar: ");
            pengajar = scanner.nextLine();
            if (!pengajar.isEmpty()) {
                break;
            }
            System.out.println("Nama pengajar tidak boleh kosong");
        }

        while (true) {
            System.out.print("Kapasitas (1-30): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Kapasitas harus angka");
                scanner.nextLine();
                continue;
            }
            kapasitas = scanner.nextInt();
            scanner.nextLine();
            if (kapasitas >= 1 && kapasitas <= 30) {
                break;
            }
            System.out.println("Kapasitas kelas antara 1 sampai 30");
        }

        int kodeBaru = daftarKelas.size() + 1;
        daftarKelas.add(new KelasMengaji(kodeBaru, namaKelas, pengajar, kapasitas));
        System.out.println("Kelas mengaji berhasil ditambahkan");
    }

    private void tampilkanKelasMengaji() {
        if (daftarKelas.isEmpty()) {
            System.out.println("\nBelum ada data kelas mengaji");
            return;
        }
        System.out.println("\n=== Data Kelas Mengaji RQ Al-Hafizh ===");
        System.out.println(KelasMengaji.getHeader());
        System.out.println("--------------------------------------------------------------");
        for (KelasMengaji kelas : daftarKelas) {
            System.out.println(kelas);
        }
    }

    private void hapusKelasMengaji() {
        if (daftarKelas.isEmpty()) {
            System.out.println("\nBelum ada data kelas");
            return;
        }
        tampilkanKelasMengaji();
        
        int nomor;
        while (true) {
            System.out.print("Masukkan kode kelas yang akan dihapus: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka");
                scanner.nextLine();
                continue;
            }
            nomor = scanner.nextInt();
            scanner.nextLine();
            if (nomor >= 1 && nomor <= daftarKelas.size()) {
                break;
            }
            System.out.println("Kode kelas tidak valid");
        }
        
        daftarKelas.remove(nomor - 1);
        System.out.println("Kelas mengaji berhasil dihapus");
    }
}