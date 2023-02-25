// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", Search_number(i));
        iScanner.close();
    }

    public static int Search_number(int n) {
        return (n * (n + 1)) / 2;
    }
}
