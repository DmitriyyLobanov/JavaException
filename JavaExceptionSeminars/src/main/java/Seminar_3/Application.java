package Seminar_3;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ConsoleUI ui = new ConsoleUI();
        String[] userInfo = ui.getInfoForCrateUser();

        User newUser = new User(userInfo);
        System.out.println(newUser.toString());

        StorageRecorder sr = new StorageRecorder();
        sr.writeUserInfoToTXT(newUser);
    }
}
