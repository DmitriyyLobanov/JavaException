package Seminar_3;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private String birthDate;
    private long phoneNumber;
    private String sex;

    public User() {
    }

    @Override
    public String toString() {
        return super.toString();
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }
}
