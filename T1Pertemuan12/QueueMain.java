import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("\n===== Menu Layanan Unit Kemahasiswaan =====");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Terakhir");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Cek Jumlah Antrian");
        System.out.println("7. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas maksimal antrian: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Queue queue = new Queue(n);
        
        int pilih;
        do {
            menu();
            System.out.print("Pilih menu (0-7): ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    if (!queue.isFull()) {
                        System.out.println("\nMasukkan data mahasiswa:");
                        System.out.print("NIM   : ");
                        String nim = sc.nextLine();
                        System.out.print("Nama  : ");
                        String nama = sc.nextLine();
                        
                        Mahasiswa mhs = new Mahasiswa(nim, nama);
                        queue.enqueue(mhs);
                    } else {
                        System.out.println("Antrian sudah penuh!");
                    }
                    break;
                case 2:
                    Mahasiswa mhs = queue.dequeue();
                    if (mhs != null) {
                        System.out.println("\nMahasiswa yang dipanggil:");
                        mhs.tampilData();
                    }
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.peekBelakang();
                    break;
                case 5:
                    queue.print();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.getSize());
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilih != 0);
    }
}