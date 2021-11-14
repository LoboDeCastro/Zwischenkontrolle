import java.util.Arrays;

public class LottoZahlenApp {

    public static void main(String[] args) {
        int[] array = generateRandomNumbers(6,45);

        System.out.println(Arrays.toString(array));
    }

    public static int[] generateRandomNumbers(int size, int maxNumber) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * maxNumber + 1);
        }
        return array;
    }
}
