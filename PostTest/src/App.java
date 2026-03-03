import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n=====SISTEM PAYROLL KARYAWAN=====\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama karyawan\t: ");
        String nama = sc.nextLine();
        System.out.print("Masukan gaji pokok\t: ");
        double gajiPokok = sc.nextDouble();
        System.out.print("Masukan jumlah jam lembur\t: ");
        int jamLembur = sc.nextInt();

        double gajilemburperjam = gajiPokok/(double)173;
        double totalLembur = gajilemburperjam * jamLembur;
        double gajikotor = gajiPokok + totalLembur;
        double pajak = gajikotor*0.05;
        double bpjs = gajiPokok * 0.01;
        double gajibersih = gajikotor - pajak - bpjs;
        System.out.println("\n===Slip Gaji===\n"+ "Karyawan\t: "+nama+"\nUpah Lembur/jam\t: "+gajilemburperjam+"\nTotal Uang Lembur\t: "+totalLembur+"\nGaji Bruto\t: "+gajikotor+"\n------------------------\nPotongan Pajak\t: "+pajak+"\nPotongan BPJS\t: "+bpjs+"\n------------------------\nGaji Bersih\t: "+gajibersih + "\n========================");

    }
}
