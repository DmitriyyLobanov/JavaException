package Seminar_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class StorageRecorder  {


    /**
     * Метод записывающий данные пользователя в файл .txt
     * Данные записываются по шаблону:
     * <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
     * @param user  объект класса User имеющий полный набор данных
     */
    public void writeUserInfoToTXT(User user){
        String fileName = user.getSurname();
        String dataToWrite = "<"+user.getSurname()+">"+
                "<"+user.getName()+">"+
                "<"+user.getPatronymic()+">"+
                "<"+user.getBirthDate()+">"+
                "<"+user.getPhoneNumber()+">"+
                "<"+user.getSex()+">\n";
        File file = new File("src/main/java/Seminar_3/SavedUsers/"+fileName+".txt");

        try(FileWriter fw = new FileWriter(file)){
            System.out.println("ok");
            fw.write(dataToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
