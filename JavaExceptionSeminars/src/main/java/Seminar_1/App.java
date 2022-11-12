package Seminar_1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //System.out.println(divideIntNumbers(20, 5));
        //String[] arr = {"234sdf", "sdf", "sdf"};
        //System.out.println(getByIndex(arr, 20));
        //helloUser();

        int[] testArr_1 = {1, 2, 3, 4, 5};
        int[] testArr_2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(subtractingArrays(testArr_1, testArr_2)));


    }
    // 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static int divideIntNumbers(int divisible, int divider) throws RuntimeException{
        if(divider == 0){
            throw new RuntimeException("Divide by zero!");
        } else {
            return divisible/divider;
        }
    }
    public static String getByIndex (String[] sourceArray, int indexOfElem) throws RuntimeException{
        if (indexOfElem >= sourceArray.length || indexOfElem < 0) {
            throw new RuntimeException("Index was outside of bounds array!");
        }
        return sourceArray[indexOfElem];
    }

    public static void helloUser() throws RuntimeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = scanner.next();
        if (name == null) {
            scanner.close();
            throw new RuntimeException("The name can`t be empty!");
        } else {
            System.out.println("Hello " + name);
            scanner.close();
        }
    }

    // 2. Второе задание выполнено в отдельном файле Task_2.txt
    // 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    //    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    //    Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static int[] subtractingArrays(int[] firstArray, int[] secondArray) throws RuntimeException {
        if (firstArray.length != secondArray.length){
            throw new RuntimeException("FirstArray length don`t equal length of second array!");
        }
        int[] resArr = new int[firstArray.length];
        for (int i = 0; i < resArr.length; i++) {
            resArr[i] = firstArray[i] - secondArray[i];
        }
        return resArr;
    }

    //  4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    //  каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    //  Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static int[] dividingArrays(int[] firstArray, int[] secondArray) throws RuntimeException {
        if (firstArray.length != secondArray.length){
            throw new RuntimeException("FirstArray length don`t equal length of second array!");
        }
        int[] resArr = new int[firstArray.length];
        for (int i = 0; i < resArr.length; i++) {
            if (secondArray[i] == 0){
                throw new RuntimeException("Divide by zero!");
            }else {
                resArr[i] = firstArray[i] / secondArray[i];
            }
        }
        return resArr;
    }
}