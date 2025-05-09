package T1Jobsheet10;

import java.util.Scanner;

public class LayananKRS {
    public static void menu() {
        System.out.println("\n+-------------------------------------------+");
        System.out.println("| No |          Menu Layanan KRS            |");
        System.out.println("+----+--------------------------------------+");
        System.out.println("| 1  | Tambah Mahasiswa ke Antrian          |");
        System.out.println("| 2  | Proses KRS Mahasiswa                 |");
        System.out.println("| 3  | Lihat Antrian Mahasiswa Terdepan     |");
        System.out.println("| 4  | Lihat Semua Antrian                  |");
        System.out.println("| 5  | Lihat Antrian Mahasiswa Terakhir     |");
        System.out.println("| 6  | Jumlah Antrian                       |");
        System.out.println("| 7  | Jumlah yang Sudah Proses KRS         |");
        System.out.println("| 8  | Jumlah yang Belum Proses KRS         |");
        System.out.println("| 9  | Kosongkan Antrian                    |");
        System.out.println("| 0  | Keluar                               |");
        System.out.println("+-------------------------------------------+");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.layaniKRS();
                    break;
                case 3:
                    antrian.tampilkanTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah proses KRS: " + antrian.getJumlahKRS());
                    break;
                case 8:
                    System.out.println("Jumlah yang belum proses KRS: " + antrian.getJumlahBelumKRS());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih Telah Menggunakan Layanan KRS. Have a nice day!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih menu yang tersedia.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
