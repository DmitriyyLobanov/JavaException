package Seminar_3;

import java.util.Scanner;

public class ConsoleUI {

    void getInfoAboutUser(){
        String userInfo;
        System.out.println("Введите информацию о пользователе в формате:\n"
                + "Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона пол(m/f)");
        Scanner scanner = new Scanner(System.in);
        userInfo = scanner.nextLine();
        if (checkInfo(userInfo) == true){
            System.out.println(userInfo);
        }else {
            System.out.println("wrong!");
        }

    }

    private boolean checkInfo(String userInfo){
        boolean result;
        String[] splitUserInfo = userInfo.split(" ");
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
    private boolean checkInitials(String arg) {
        char[] chars = arg.toCharArray();
        for (char c : chars) {
            if(Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDate(String arg){
        boolean isValid;
        if (arg.matches("([0-9]{2}).([0-9]{2}).([0-9]{4})")){
            isValid = true;
        }else {
            isValid = false;
        }
        return isValid;
    }

    private boolean checkPhoneNumber(String arg) {
        char[] chars = arg.toCharArray();
        for (char c : chars) {
            if(Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

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
