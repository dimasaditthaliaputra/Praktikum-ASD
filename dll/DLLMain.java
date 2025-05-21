package dll;

import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedLists06 list = new DoubleLinkedLists06();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah setelah NIM tertentu");
            System.out.println("4. Tambah pada indeks tertentu");
            System.out.println("5. Hapus setelah NIM tertentu");
            System.out.println("6. Hapus berdasarkan indeks");
            System.out.println("7. Hapus di awal");
            System.out.println("8. Hapus di akhir");
            System.out.println("9. Tampilkan data");
            System.out.println("10. Tampilkan data pertama");
            System.out.println("11. Tampilkan data terakhir");
            System.out.println("12. Tampilkan data berdasarkan indeks");
            System.out.println("13. Cari Mahasiswa berdasarkan NIM");
            System.err.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("Masukkan NIM yang jadi acuan (akan disisipkan setelah ini): ");
                    String nim = scan.nextLine();
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    list.insertAfter(nim, mhs);
                }
                case 4 -> {
                    System.out.print("Masukkan indeks untuk menambahkan data: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }
                case 5 -> {
                    System.out.print("Masukkan NIM yang jadi acuan: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 6 -> {
                    System.out.print("Masukkan indeks data yang mau dihapus: ");
                    int index = scan.nextInt();
                    list.remove(index);
                }
                case 7 -> list.removeFirst();
                case 8 -> list.removeLast();
                case 9 -> list.print();
                case 10 -> list.getFirst();
                case 11 -> list.getLast();
                case 12 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan.nextInt();
                    list.getIndex(idx);
                }
                case 13 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node06 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 14 -> System.out.println("Jumlah data: " + list.size());
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa06 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa06(nim, nama, kelas, ipk);
    }
}
