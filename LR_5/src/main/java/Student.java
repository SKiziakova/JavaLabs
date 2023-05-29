import java.sql.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date birthDate;
    private String gradebookNumber;

    public Student(int id, String firstName, String lastName, String patronymic, Date birthDate, String gradebookNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.gradebookNumber = gradebookNumber;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getGradebookNumber() {
        return gradebookNumber;
    }
    public void setGradebookNumber(String gradebookNumber) {
        this.gradebookNumber = gradebookNumber;
    }

    @Override
    public String toString() {
        return "Student " + id + ": {\n" +
                "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "patronymic: " + patronymic + "\n" +
                "birthDate: " + birthDate + "\n" +
                "gradebookNumber: " + gradebookNumber + "\n" +
                "}";
    }
}
