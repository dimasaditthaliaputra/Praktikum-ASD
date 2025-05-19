public class Queue {
    Node front;
    Node rear;
    int size;
    int max;

    public Queue(int max) {
        this.max = max;
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Queue berhasil dikosongkan!");
    }

    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Queue sudah penuh!");
            return;
        }
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian");
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
            return null;
        }
        Mahasiswa data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public void peekBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampilData();
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = front;
            int i = 0;
            System.out.println("Isi antrian: ");
            while (tmp != null) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ":");
                tmp.data.tampilData();
                System.out.println();
                tmp = tmp.next;
                i++;
            }
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public int getSize() {
        return size;
    }
}