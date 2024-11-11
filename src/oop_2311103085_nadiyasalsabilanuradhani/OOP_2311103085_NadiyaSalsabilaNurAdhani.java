package oop_2311103085_nadiyasalsabilanuradhani;

/**
 * @author NADIYA SALSABILA NUR ADHANI
 * 2311103085
 * S1SI07B
 */

public class OOP_2311103085_NadiyaSalsabilaNurAdhani {

    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("||                   SELAMAT DATANG                   ||");
        System.out.println("||                  DI WARNET GURITA                  ||");
        System.out.println("========================================================");
        System.out.println(" ");
        
        System.out.println("--------------------------------------------------------");
        System.out.println("|                  Informasi Warnet                    |");
        System.out.println("--------------------------------------------------------");
        Komputer komputer = new Komputer(45, "Warnet Gurita", 5000);
        komputer.informasi();
        System.out.println("========================================================");
        System.out.println(" ");

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(" ");
        
        System.out.println("--------------------------------------------------------");
        System.out.println("|                 Informasi Komputer                   |");
        System.out.println("--------------------------------------------------------");
        KomputerVIP komputerVIP = new KomputerVIP(7, "Warnet Gurita", 7000, true);
        komputerVIP.informasi();

        System.out.println(" ");
        System.out.println("Benefit Member VIP:");
        System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
        System.out.println("- Gratis minuman setiap 4 jam bermain");
        System.out.println("- Prioritas booking komputer gaming");
        System.out.println(" ");
        
        System.out.println("--------------------------------------------------------");
        komputerVIP.login("nadiyasalsa");
        System.out.println("--------------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("--------------------------------------------------------");
        System.out.println("|                 Informasi Tambahan                   |");
        System.out.println("--------------------------------------------------------");
        komputerVIP.bermain(2);
        komputerVIP.bermain(1, 30);
        System.out.println("========================================================");
        System.out.println(" ");

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(" ");

        System.out.println("--------------------------------------------------------");
        System.out.println("|                 Informasi Komputer                   |");
        System.out.println("--------------------------------------------------------");
        KomputerVIP komputerNonVIP = new KomputerVIP(4, "Warnet Gurita", 7000, false);
        komputerNonVIP.informasi();
        
        System.out.println(" ");
        System.out.println("Benefit Member VIP:");
        System.out.println("- Tidak Ada");
        System.out.println(" ");

        System.out.println("--------------------------------------------------------");
        komputerNonVIP.login("cacaa");
        System.out.println("--------------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("--------------------------------------------------------");
        System.out.println("|                 Informasi Tambahan                   |");
        System.out.println("--------------------------------------------------------");
        komputerNonVIP.bermain(2);
        komputerNonVIP.bermain(1, 30);
        System.out.println("========================================================");
        System.out.println(" ");

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(" ");
        
        System.out.println("--------------------------------------------------------");
        System.out.println("|                 Informasi Komputer                   |");
        System.out.println("--------------------------------------------------------");
        KomputerPremium komputerPremium = new KomputerPremium(8, "Warnet Gurita", 10000, true);
        komputerPremium.informasi();
        
        System.out.println(" ");
        System.out.println("Fasilitas Ruang Premium:");
        System.out.println("- Ruangan ber-AC");
        System.out.println("- Sofa Gaming exclusive");
        System.out.println("- Komputer berspesifikasi tinggi");
        System.out.println("- Koneksi internet dedicated 100 Mbps");
        System.out.println(" ");
        
        System.out.println("--------------------------------------------------------");
        komputerPremium.pesan(2);
        System.out.println("--------------------------------------------------------");
        System.out.println(" ");

        System.out.println("--------------------------------------------------------");
        System.out.println("|                 Informasi Tambahan                   |");
        System.out.println("--------------------------------------------------------");
        komputerPremium.tambahLayanan("French fries");
        komputerPremium.tambahLayanan("Burger", "Lemon Tea Ice");
        System.out.println("========================================================");
        System.out.println(" ");
    }
}