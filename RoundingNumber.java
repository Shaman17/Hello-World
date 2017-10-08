package HomeWork2;
import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите действительное число a: ");
        double a = sc.nextDouble();

        long b = Math.round(a);
        System.out.print("Округленное число a = " + b);
    }
}