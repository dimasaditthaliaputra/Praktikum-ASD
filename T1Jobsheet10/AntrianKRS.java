package T1Jobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jmlSudahKRS = 0;
    int maksimalKRS = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    public void layaniKRS() {
        if (isEmpty()) {
            System.out.println("Tidak Ada Antrian.");
            return;
        }

        int sisaKRS = maksimalKRS - jmlSudahKRS;

        if (sisaKRS <= 0) {
            System.out.println("Proses KRS dihentikan. DPA sudah melayani maksimal 30 mahasiswa.");
            return;
        }

        if (size == 1 || sisaKRS == 1) {
            System.out.println("Proses KRS untuk 1 mahasiswa:");
            Mahasiswa mhs1 = data[front];
            System.out.printf("%-12s %-20s %-15s %-10s\n", "NIM", "Nama", "Prodi", "Kelas");
            System.out.printf("%-4d ", 1);
            mhs1.tampilkanData();

            front = (front + 1) % max;
            size--;
            jmlSudahKRS++;
            System.out.println("Proses KRS selesai untuk 1 mahasiswa.");
        } else {
            System.out.println("Proses KRS untuk 2 mahasiswa:");
            System.out.printf("%-4s %-12s %-20s %-15s %-10s\n", "No", "NIM", "Nama", "Prodi", "Kelas");
            System.out.println("---------------------------------------------------------------");

            Mahasiswa mhs1 = data[front];
            Mahasiswa mhs2 = data[(front + 1) % max];

            System.out.printf("%-4d ", 1);
            mhs1.tampilkanData();

            System.out.printf("%-4d ", 2);
            mhs2.tampilkanData();

            front = (front + 2) % max;
            size -= 2;
            jmlSudahKRS += 2;
            System.out.println("Proses KRS selesai untuk 2 mahasiswa.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar mahasiswa dalam antrian:");
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-4s %-12s %-20s %-15s %-10s\n", "No", "NIM", "Nama", "Prodi", "Kelas");
            System.out.println("---------------------------------------------------------------");

            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.printf("%-4d ", (i + 1));
                data[index].tampilkanData();
            }
            System.out.println("---------------------------------------------------------------");
        }
    }

    public void tampilkanTerdepan() {
        if (isEmpty()) {
            System.out.println("Tidak Ada Antrian.");
        } else if (size == 1) {
            System.out.println("Mahasiswa terdepan:");
            System.out.printf("%-12s %-20s %-15s %-10s\n", "NIM", "Nama", "Prodi", "Kelas");
            data[front].tampilkanData();
        } else {
            System.out.println("Dua mahasiswa terdepan:");
            System.out.printf("%-4s %-12s %-20s %-15s %-10s\n", "No", "NIM", "Nama", "Prodi", "Kelas");
            System.out.println("---------------------------------------------------------------");

            Mahasiswa mhs1 = data[front];
            Mahasiswa mhs2 = data[(front + 1) % max];

            System.out.printf("%-4d ", 1);
            mhs1.tampilkanData();

            System.out.printf("%-4d ", 2);
            mhs2.tampilkanData();

            System.out.println("---------------------------------------------------------------");
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Tidak Ada Antrian.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            System.out.printf("%-12s %-20s %-15s %-10s\n", "NIM", "Nama", "Prodi", "Kelas");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahKRS() {
        return jmlSudahKRS;
    }

    public int getJumlahBelumKRS() {
        return maksimalKRS - jmlSudahKRS;
    }
}