import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {
                4, 1, 9, 2, 4,6, 8, 1, 0
        };

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
