package HomeWork2;

public class MaxMin {
    public static void main(String[] args) {

        int[] array = new int[100];

        for(int x = 0; x < array.length; x++) {
            array[x] = (int)(Math.random()*100);
        }

        int max = 0;
        for (int x =0; x < array.length; x++) {
            if (max < array[x]) {
                max = array[x];
            }
        }
        System.out.println("Максимум в массиве: " + max);

        int min = max;
        for (int x = 0; x < array.length; x++) {
            if (min > array[x]) {
                min = array[x];
            }
        }
        System.out.println("Минимум в массиве: " + min);
    }
}