package Pertemuan12;

import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList06 sll = new SingleLinkedList06();

        Mahasiswa06 mhs1 = new Mahasiswa06("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa06 mhs2 = new Mahasiswa06("23212201", "Bimon", "2B", 3.8);
        Mahasiswa06 mhs3 = new Mahasiswa06("22212206", "Cintia", "3C", 3.5);
        Mahasiswa06 mhs4 = new Mahasiswa06("21212203", "Dirga", "4D", 3.6);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);

        int pilihan;

        do {
            printMenu();
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa06 mhsAwal = inputData(sc);
                    sll.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa06 mhsAkhir = inputData(sc);
                    sll.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan nama setelah siapa data ditambahkan: ");
                    String namaCari = sc.nextLine();
                    Mahasiswa06 mhsSetelah = inputData(sc);
                    sll.insertAfter(namaCari, mhsSetelah);
                    break;
                case 4:
                    System.out.print("Masukkan index posisi: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa06 mhsIndex = inputData(sc);
                    sll.insertAt(index, mhsIndex);
                    break;
                case 5:
                    sll.printl();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    public static void printMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Tambah Mahasiswa di Awal");
        System.out.println("2. Tambah Mahasiswa di Akhir");
        System.out.println("3. Tambah Mahasiswa Setelah Nama Tertentu");
        System.out.println("4. Tambah Mahasiswa di Index Tertentu");
        System.out.println("5. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
    }

    public static Mahasiswa06 inputData(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa06(nim, nama, kelas, ipk);
    }
}
