package Pertemuan12;

public class SingleLinkedList06 {
    NodeMahasiswa06 head;
    NodeMahasiswa06 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void printl() {
        if (!isEmpty()) {
            NodeMahasiswa06 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong.");
        }
    }

    public void addFirst(Mahasiswa06 input) {
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;

        }
    }

    public void addLast(Mahasiswa06 input) {
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa06 input) {
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        NodeMahasiswa06 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa06 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa06 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa06(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
