import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        double fahrenheit = celsius * 9/5 + 32;
        System.out.printf("%.2f degrees Celcius is equal to %.2f degrees Fahrenheit.", celsius, fahrenheit);
        
    }
}
