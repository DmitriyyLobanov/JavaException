package Seminar_3;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleUI {

    // Тестовый метод, использовался для проверки.
/*    public void getInfoAboutUser(){
        String userInfo;
        System.out.println("Введите информацию о пользователе в формате:\n"
                + "Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона пол(m/f)");
        Scanner scanner = new Scanner(System.in);
        userInfo = scanner.nextLine();
        if (checkInfo(userInfo) == true){
            System.out.println(userInfo);

        }else {
            System.out.println("wrong, try again!");
        }

    }*/

    /**
     * Метод получения информации о пользователе из консоли.
     * Информация проверяется на соответсвие шаблону:
     * Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона пол(m/f)
     * @return Строковый массив введенных данных.
     */
    public String[] getInfoForCrateUser(){
        String userInfo = "";
        boolean flag = false;
        while (!flag){
            System.out.println("Введите информацию о пользователе в формате:\n"
                    + "Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона пол(m/f)");
            try (Scanner scanner = new Scanner(System.in)){
                while (scanner.hasNext()){
                    userInfo = scanner.nextLine();
                    if (checkInfo(userInfo)){
                        System.out.println("Data accepted!");
                        flag = true;
                        break;
                    }else {
                        System.out.println("Wrong input, try again!");
                    }
                }
            }
        }

        return userInfo.split(" ");
    }

    /**
     * Приватный метод, проверяющий валидность введенных пользователем данных
     * @param userInfo строка введенная пользователем в консоль
     * @return true/false
     */
    private boolean checkInfo(String userInfo){
        boolean result;
        String[] splitUserInfo = userInfo.split(" ");

        if(splitUserInfo.length != 6){
            return false;
        }
        if(!checkInitials(splitUserInfo[0]) ||
            !checkInitials(splitUserInfo[1]) ||
            !checkInitials(splitUserInfo[2])){
            result = false;
        }else {
            result = true;
        }

        if (!checkDate(splitUserInfo[3])){
            result = false;
        }else {
            result = true;
        }

        if (!checkPhoneNumber(splitUserInfo[4])){
            result = false;
        }else {
            result = true;
        }

        if (!checkGender(splitUserInfo[5])){
            result = false;
        }else {
            result = true;
        }
        return result;
    }

    /**
     * Приватный метод проверяющий валидность введенных инициалов
     * @param arg  элемент ФИО
     * @return true/false
     */
    private boolean checkInitials(String arg) {
        char[] chars = arg.toCharArray();
        for (char c : chars) {
            if(Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Приватный метод проверяющий соответствие введенной даты рождения шаблону dd.mm.yyyy
     * @param arg  строковая запись даты
     * @return true/false
     */
    private boolean checkDate(String arg){
        boolean isValid;
        if (arg.matches("([0-9]{2}).([0-9]{2}).([0-9]{4})")){
            isValid = true;
        }else {
            isValid = false;
        }
        return isValid;
    }


    /**
     * Приватный метод проверяющий введенный номер телефона
     * @param arg  строковая запись номера телефона
     * @return true/false
     */
    private boolean checkPhoneNumber(String arg) {
        char[] chars = arg.toCharArray();
        for (char c : chars) {
            if(Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Приватный метод проверяющий соответствие введенной половой пренадлежности шаблону m/f
     * @param arg  строковая запись пола
     * @return true/false
     */
    private boolean checkGender(String arg){
        if (arg.length() > 1){
            System.out.println("length >");
            return false;
        } else if (arg.equals("m") || arg.equals("f")) {
            return true;
        }else {
            return false;
        }
    }
}
