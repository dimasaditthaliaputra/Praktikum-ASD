package dll;

public class DoubleLinkedLists06 {
    Node06 head;
    Node06 tail;

    public DoubleLinkedLists06() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa06 data) {
        Node06 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node06 newNode = new Node06(data);
        
        // Jika current adalah tail, cukup tambahkan diakhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List masih kosong.");
            return;
        }
        Node06 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next; 
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        } 
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah : ");
            head.data.tampil();
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah : ");
            head.data.tampil();
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah : ");
            tail.data.tampil();
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah : ");
            tail.data.tampil();
            tail = tail.prev;
            tail.next = null;
        }
    }

    public Node06 search(String nim) {
        Node06 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
}
