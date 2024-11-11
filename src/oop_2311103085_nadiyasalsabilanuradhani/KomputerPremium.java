package oop_2311103085_nadiyasalsabilanuradhani;

/**
 * @author NADIYA SALSABILA NUR ADHANI
 * 2311103085
 * S1SI07B
 */

public class KomputerPremium extends Komputer {
    protected boolean ruangPremium;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPremium = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status          : " + (ruangPremium ? "Ruangan Premium" : "Ruangan Non-Premium"));
    }

    
    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor : " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan : " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan : " + makanan + minuman);
    }
}