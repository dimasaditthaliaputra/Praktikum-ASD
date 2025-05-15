package Pertemuan12;

import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        SingleLinkedList06 sll = new SingleLinkedList06();

        Mahasiswa06 mhs1 = new Mahasiswa06("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa06 mhs2 = new Mahasiswa06("23212201", "Bimon", "2B", 3.8);
        Mahasiswa06 mhs3 = new Mahasiswa06("22212206", "Cintia", "3C", 3.5);
        Mahasiswa06 mhs4 = new Mahasiswa06("21212203", "Dirga", "4D", 3.6);

        sll.printl();
        sll.addFirst(mhs4);
        sll.printl();
        sll.addLast(mhs1);
        sll.printl();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.printl();
    }
}
