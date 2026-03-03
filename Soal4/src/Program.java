import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan total detik: ");
        int total = sc.nextInt();
        int jam = total / 3600;
        int sisa = total % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;
        System.out.printf("Hasil konversi: %d Jam, %d Menit, %d Detik.", jam, menit, detik);
    }
}
