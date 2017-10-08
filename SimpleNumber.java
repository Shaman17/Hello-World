package HomeWork2;

public class SimpleNumber {
    public static void main(String[] args) {

        int[] array = new int[9999];

        int a = 2;
        for (int x = 0; x < array.length; x++) {
            array[x] = a;
            a++;
            System.out.print(array[x] + " ");
        }

        int[] simpleArray = new int[10000];
        int c =0;
        for (int x = 0; x < array.length; x++) {
            int b = 1;
            int f = 1;
            for(int y = 2; y < array[x]; y++) {
                b = array[x]%y;
                if (b == 0) {
                    f = 0;
                }
            }
            if (f == 1) {
                simpleArray[c] = array[x];
                c++;
            }
        }

        int z = 0;
        for (int x = 0; x < simpleArray.length; x++) {
            if (simpleArray[x] != 0) {
                z++;
            }

        }

        int[] arrayEnd = new int[z];

        System.out.println();
        for (int x =0; x < z; x++) {
            arrayEnd[x] = simpleArray[x];
            System.out.print(arrayEnd[x] + " ");
        }
    }
}