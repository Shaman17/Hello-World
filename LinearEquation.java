package Homework1;
import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Дано линейное уравние ax+b=0");
        System.out.print("Введите число a, не равное нулю: ");
        double a = sc.nextDouble();

        System.out.print("Введите число b: ");
        double b = sc.nextDouble();
        double x = -b/a;

        System.out.println("Решение уравнения: x = " + x);
    }
}