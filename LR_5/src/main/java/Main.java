import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // З'єднання з базою даних
        String url = "jdbc:sqlserver://DESKTOP-H5N6SQ6:1433;databaseName=studentsList;integratedSecurity=true";

        try (Connection connection = DriverManager.getConnection(url)) {
            // SQL-запит для отримання студентів, народжених в березні
            String sql = "SELECT * FROM Students WHERE MONTH(BirthDate) = 3";

            // Виконання запиту
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Створення списку для збереження студентів
            List<Student> students = new ArrayList<>();

            // Обробка результатів запиту
            while (resultSet.next()) {
                int id = resultSet.getInt("Id student");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String patronymic = resultSet.getString("Patronymic");
                Date birthDate = resultSet.getDate("BirthDate");
                String gradebookNumber = resultSet.getString("gradeBookNumber");

                // Створення об'єкта Student і додавання його до списку
                Student student = new Student(id, firstName, lastName, patronymic, birthDate, gradebookNumber);
                students.add(student);
            }

            // Виведення інформації про студентів
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

