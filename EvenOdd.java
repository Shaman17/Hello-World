package Homework1;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число a: ");
        int a = sc.nextInt();

        if (a%2 == 0) {
            System.out.println("Число а является четным");
        } else {
            System.out.println("Число а является нечетным");
        }
    }
}