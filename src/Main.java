import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arcs) {
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Random random = new Random();
        double v1 = random.nextInt(10);
        double v2 = random.nextInt(10);

        System.out.println("Cколько будет" + v1 + "+" + v2 + "?");

        ArithmeticOperations a = new ArithmeticOperations(v1, v2);
        double result1 = a.addition();
        double v = scanner.nextDouble();
        if (result1 == v){
            System.out.println("Поздравляю! Вы  правильно ответили на вопрос");
        } else {
            System.out.println("Увы," + name +", правильный ответ " + result1);
        }


        double v3 = random.nextInt(10);
        double v4 = random.nextInt(10);

        System.out.println("Cколько будет " + v3 + "-" + v4 + "?");

        ArithmeticOperations b = new ArithmeticOperations(v3, v4);
        double result2 = b.subtraction();
        double vv = scanner.nextDouble();
        if (result2 == vv){
            System.out.println("Поздравляю! Вы правильно ответили на вопрос");
        } else {
            System.out.println("Увы, " + name +", правильный ответ " + result2);
        }


        double v5 = random.nextInt(10);
        double v6 = random.nextInt(10);

        System.out.println("Cколько будет " + v5 + "*" + v6 + "?");

        ArithmeticOperations c = new ArithmeticOperations(v5, v6);
        double result3 = c.multiplication();
        double vvv = scanner.nextDouble();
        if (result3 == vvv){
            System.out.println("Поздравляю! Вы правильно ответили на вопрос");
        } else {
            System.out.println("Увы, " + name +", правильный ответ " + result3);
        }


        double v7 = random.nextInt(10);
        double v8 = random.nextInt(10);

        System.out.println("Cколько будет " + v7 + "/" + v8 + "?");

        ArithmeticOperations d = new ArithmeticOperations(v7, v8);
        double result4 = d.division();
        double vvvv = scanner.nextDouble();
        if (result3 == vvvv){
            System.out.println("Поздравляю! Вы правильно ответили на вопрос");
        } else {
            System.out.println("Увы, " + name +", правильный ответ " + result4);
        }

    }


    public static class ArithmeticOperations {
        double number1;
        double number2;

        ArithmeticOperations(double number1, double number2) {
            this.number1 = number1;
            this.number2 = number2;
        }

        double addition() { // метод сложение возвращает число типа double
            return this.number1 + number2;
        }

        double subtraction() { // метод сложение возвращает число типа double
            return this.number1 - number2
                    ;
        }

        double multiplication() { // метод сложение возвращает число типа double
            return this.number1 * number2;
        }

        double division() { // метод сложение возвращает число типа double
            return this.number1 / number2;
        }

        public static void main(String[] args) {
            System.out.print("Введите два числа через пробел");
            Scanner scan = new Scanner(System.in);
            double number1 = scan.nextDouble();
            double number2 = scan.nextDouble();

            ArithmeticOperations a = new ArithmeticOperations(number1, number2);
            double result1 = a.addition();
            double result2 = a.subtraction();
            double result3 = a.multiplication();
            double result4 = a.division();
            System.out.println("addition = " + result1);
            System.out.println("subtraction = " + result2);
            System.out.println("multiplication = " + result3);
            System.out.println("division = " + result4);

            if ((result1 % 2) == 0) {
                System.out.println("The addition is even");
            } else {
                System.out.println("The addition is odd");
            }
        }
    }


}

