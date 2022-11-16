package Seminar_2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // float test1 = InputFloatNumber();
        // System.out.println(test1);
        inputString();
    }
    // 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    // Ввод текста вместо числа не должен приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float InputFloatNumber(){
        float resultNumber;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the float value: ");
            while (!scanner.hasNextFloat()) {
                System.out.println("Enter other value: ");
                scanner.next();
            }
            resultNumber = scanner.nextFloat();
            scanner.close();
            return resultNumber;
        }
    }

    // 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void inputString(){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your string: ");
            System.out.println(scanner.next());
        }catch (NoSuchElementException e){
            System.out.println("Input does`t be an empty!");
            e.printStackTrace();
        }
    }

    // 2. Задания на исправление кода.
/*    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException | IndexOutOfBoundException e) {
        e.printStackTrace();
    }*/
    // Здесь вообще непонятно что нужно исправлять, в третьей же строке делят на ноль (при чем делимым выступает
    // неизестный элемент массива, которого может не быть в принципе), поэтому добавляю исключение по массиву и
    // изменяю вывод информации о исключении в угоду printStackTrace().


/*    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            eх.printStackTrace();
        }
    }
    public static void printSum(Integer a, Integer b) {
        try{
            System.out.println(a + b);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

    }*/
    // Со сложением чисел проблем не возникнет кроме вероятного отсутсвия аргументов,
    // а вот с обращением к несуществующему элементу массива будут проблемы.

}
