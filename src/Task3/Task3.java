package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task3 {
    private static final String WORD = "stop";
    private static final String WORD2 = "status";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.printf("Введите число. Чтобы закончить введите \"%s\"." +
                    "\nЧтобы вывести все введенные числа в отсортированном виде введите  \"%s\".\n", WORD, WORD2);
            String str = "";

            List<Integer> numbers = new LinkedList<>();

            while (true) {
                str = reader.readLine();

                if (str.equalsIgnoreCase(WORD2)) {
                    Collections.sort(numbers);
                    System.out.println(numbers);
                    continue;
                }
                if (str.equalsIgnoreCase(WORD)) {
                    break;
                }
                try {
                    numbers.add(Integer.parseInt(str));
                } catch (NumberFormatException e) {
                    System.out.println("Это не число");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}