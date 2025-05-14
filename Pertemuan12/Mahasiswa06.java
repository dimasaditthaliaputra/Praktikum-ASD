package Pertemuan12;

public class Mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa06() {
    }

    public Mahasiswa06(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }    
}