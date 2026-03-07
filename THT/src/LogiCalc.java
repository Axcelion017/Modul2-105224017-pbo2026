import java.util.Scanner;
public class LogiCalc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SISTEM LOGICACL FASTSEND ===");
        System.out.print("Masukan nama klien\t: ");
        String nama = sc.nextLine();
        System.out.print("Total berat barang\t: ");
        double berat = sc.nextDouble();
        System.out.print("Jarak tujuan\t: ");
        int jarak = sc.nextInt();
        System.out.print("Jumlah total Box/Kardus\t: ");
        int box = sc.nextInt();
        sc.close();


        // Penghitungan kebutuhan armada
        String total = "";
        int truk = box/150;
        if (box >= 150) {
            total += "[" + truk + "] Truk Penuh ";
            if (box%150 != 0) {
            total += " dan sisa [" + (box%150) + "] box via Pikap";
        }
        }else {
            total += "[" + box + "] box via Pikap";
        }

        //Penghitungan Biaya Pengiriman
        double tarifjarak = 15000.00;
        double tarifberat = 5500.00;
        double dasarbiaya = (jarak * tarifjarak) + (berat * tarifberat);
        double asuransi = 0.035 * dasarbiaya;
        double totalbiaya = dasarbiaya + asuransi;

        //Penghitungan estimasi waktu pengiriman
        int kecepatan = 60; 
        int jam = jarak / kecepatan;
        int menit = (jarak % kecepatan) * 60 / kecepatan;

        System.out.println("================ RESI PENGIRIMAN ================");
        System.out.println("Klien \t\t\t: " + nama);
        System.out.println("Total Box \t\t: " + box);
        System.out.println("Kebutuhan Armada \t: " + total );
        System.out.println("\nEstimasi Waktu \t\t: [" + jam + "] Jam [" + menit + "] Menit");
        System.out.println("\n================ RINCIAN BIAYA ================");
        System.out.printf("Dasar Biaya \t\t: Rp [%,.2f]\n", dasarbiaya);
        System.out.printf("Asuransi (3.5%%) \t: Rp [%,.2f]\n", asuransi);
        System.out.println("---------------------------------------------");
        System.out.printf("TOTAL BAYAR \t\t: Rp [%,.2f]\n", totalbiaya);
        System.out.println("=============================================");

    }
}
