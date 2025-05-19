public class Mahasiswa {
    String nim;
    String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
    }
}