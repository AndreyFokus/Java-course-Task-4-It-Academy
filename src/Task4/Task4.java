package Task4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

    public static Scanner scanner = new Scanner(System.in);
    public static int firstDigit, secondDigit;
    public static char sign;

    public static void main(String[] args) throws IOException, InputMismatchException {

        System.out.print("Введите первое число: ");
        firstDigit = scanner.nextInt();

        System.out.print("Введите второе число: ");
        secondDigit = scanner.nextInt();

        System.out.print("Введите знак: ");
        sign = (char) System.in.read();

        makeOperation(sign);
    }

    public static void makeOperation(char sign) {

        int result = 0;

        if (sign == '+') {
            result = plus(firstDigit, secondDigit);
        }
        else if (sign == '-') {
            result = minus(firstDigit, secondDigit);
        }
        else if (sign == '*') {
            result = multiply(firstDigit, secondDigit);
        }
        else if (sign == '/') {
            result = divide(firstDigit, secondDigit);
        }
        resultPrint(result);
    }

    public static int plus(int first, int second) {
        int sum;
        sum = first + second;
        return sum;
    }

    public static int minus(int first, int second) {
        return first - second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static int divide(int first, int second) throws ArithmeticException {
        return first / second;
    }

    public static void resultPrint(int result) {

        System.out.println(result);
    }
}
