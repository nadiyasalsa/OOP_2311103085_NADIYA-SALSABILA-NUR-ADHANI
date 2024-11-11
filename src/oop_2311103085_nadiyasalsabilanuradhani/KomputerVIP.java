package oop_2311103085_nadiyasalsabilanuradhani;

/**
 * @author NADIYA SALSABILA NUR ADHANI
 * 2311103085
 * S1SI07B
 */

public class KomputerVIP extends Komputer {
    protected boolean isMemberVIP;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean isMemberVIP) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.isMemberVIP = isMemberVIP;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status          : " + (isMemberVIP ? "Member VIP" : "Member Non-VIP"));
    }                                   

    public void login(String username) {
        System.out.println("Login dengan username : " + username);
    }

    public void bermain(int jam) {
        float biaya = jam * hargaPerJam;
        if (isMemberVIP) {
            biaya *= 0.9; 
        }
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        float biaya = (jam + (menitTambahan / 60.0f)) * hargaPerJam;
        if (isMemberVIP) {
            biaya *= 0.9; 
        }
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}