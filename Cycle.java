package HomeWork2;

public class Cycle {
    public static void main(String[] args) {

        int x = 0;
        while (x < 5) {
            System.out.println("HelloWorld");
            x++;
        }

        System.out.println();

        x = 0;
        do {
            System.out.println("HelloWorld");
            x++;
        } while (x<5);

        System.out.println();

        for (x = 0; x < 5; x++) {
            System.out.println("HelloWorld");
        }
    }
}