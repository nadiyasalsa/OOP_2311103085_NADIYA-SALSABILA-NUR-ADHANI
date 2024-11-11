package oop_2311103085_nadiyasalsabilanuradhani;

/**
 * @author NADIYA SALSABILA NUR ADHANI
 * 2311103085
 * S1SI07B
 */

public class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    public void informasi() {
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet     : " + namaWarnet);
        System.out.println("Harga Per-Jam   : Rp" + hargaPerJam);
    }                                                       
}