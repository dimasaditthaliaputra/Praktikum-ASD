package Jobsheet9;

public class StackTugasMahasiswa06 {
    Mahasiswa06[] stack;
    int top;
    int size;

    public StackTugasMahasiswa06(int size) {
        this.size = size;
        stack = new Mahasiswa06[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa06 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak dapat menambahkan tugas lagi.");
        }
    }

    public Mahasiswa06 pop() {
        if (!isEmpty()) {
            Mahasiswa06 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa06 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public Mahasiswa06 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        } else {
            System.out.println("Belum ada tugas yang dikumpulkan.");
        }
        System.out.println("");
    }
    public void countTasks() {
        if (!isEmpty()) {
            System.out.println("Jumlah tugas yang dikumpulkan: " + (top + 1));
        } else {
            System.out.println("Tidak ada tugas yang dikumpulkan.");
        }
    }    
}
