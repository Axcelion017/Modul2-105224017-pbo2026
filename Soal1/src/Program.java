import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws Exception {
        double pjg, lbr, tgi;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        pjg = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        lbr = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        tgi = input.nextDouble();
        System.out.println("Luas dinding ruangan: " + (pjg * lbr));
        System.out.println("Liter cat yang dibutuhkan: " + Math.ceil((pjg * lbr) / 10));
    }
}
