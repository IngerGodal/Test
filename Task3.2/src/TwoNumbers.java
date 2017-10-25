import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Введите первое число");
        number1 = input.nextInt();
        System.out.println("Введите второе число");
        number2 = input.nextInt();

        System.out.println("_______Решение задачи_______");
        solution(number1, number2);
    }

    static void solution(int number1, int number2) {
        int limitOfTry;
        int resultMultiplication;
        int countTry;
        int tmp;
        boolean flag;

        countTry = 1;
        limitOfTry = 10;
        tmp = number1;
        flag = false;

        resultMultiplication = number1 * number2;

        while(countTry <= limitOfTry) {
            tmp += number2;

            if (tmp > resultMultiplication) {
                flag = true;
                break;
            }

            countTry++;
        }

        if (flag == true) {
            System.out.print("Цель достигнута! Количество попыток : " + "[ " + countTry + " ]");
        } else {
            System.out.print("Цель не достигнута, попытки исчерпаны...");
        }
    }
}