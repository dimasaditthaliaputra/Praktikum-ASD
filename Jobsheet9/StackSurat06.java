package Jobsheet9;

public class StackSurat06 {
    Surat06[] stack;
    int top;
    int size;

    public StackSurat06(int size) {
        this.size = size;
        stack = new Surat06[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat06 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat06 pop() {
        if (!isEmpty()) {
            Surat06 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang bisa diproses.");
            return null;
        }
    }

    public Surat06 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ketemu = true;
                System.out.println("Surat ditemukan:");
                System.out.printf("ID: %s | Nama: %s | Kelas: %s | Jenis: %s | Durasi: %d hari\n",
                        stack[i].idSurat, stack[i].namaMahasiswa, stack[i].kelas,
                        stack[i].jenisIzin == 'S' ? "Sakit" : "Izin", stack[i].durasi);
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat dengan nama tersebut tidak ditemukan.");
        }
    }
}