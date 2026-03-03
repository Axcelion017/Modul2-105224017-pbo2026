import java.util.Scanner;
public class Latihan{
    public static void main(String[] args) throws Exception {
        String nama = "Michael Alexander Newton";
        int sks;
        double ipk = 3.98;
        boolean lulus = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan SKS: ");
        sks = sc.nextInt();
        sc.close();
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("IPK: " + ipk);
        System.out.println("Lulus: " + lulus);
    }
}
