import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveEvenFinder {
    public static void main(String[] args) {
        File file = new File("src/resources/numbers.txt");
        List<Integer> positiveEvenNumbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (number > 0 && number % 2 == 0) {
                    positiveEvenNumbers.add(number);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }

        System.out.println("Положительные и чётные числа из файла:");
        for (int number : positiveEvenNumbers) {
            System.out.println(number);
        }
    }
}