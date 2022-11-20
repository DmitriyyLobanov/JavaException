package Seminar_3;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private final String birthDate;
    private String phoneNumber;
    private String sex;

    public User(String[] userInfo) {
        this.surname = userInfo[0];
        this.name = userInfo[1];
        this.patronymic = userInfo[2];
        this.birthDate = userInfo[3];
        this.phoneNumber = userInfo[4];
        this.sex = userInfo[5];
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }
}
