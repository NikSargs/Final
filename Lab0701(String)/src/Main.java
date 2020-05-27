import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {
                4, 1, 9, 2, 4, 6, 8, 1, 0
        };

        Arrays.sort(numbers);

        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        String[] words = {
                "C#" ,"Kotlin ","Java", "C", "Scala", "C++"
        };

        Arrays.sort(words);

        for (String word : words){
            System.out.print(word + " ");
        }
        System.out.println();

    }
}