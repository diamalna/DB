import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/StudentsDB";
        String login = "root";
        String password ="";

        try {
            Connection connection = DriverManager.getConnection(url, login, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM students");

            while (result.next()) {
                System.out.println(result.getInt("id") + "\t"
                        + result.getString("stud_name") + "\t"
                        + result.getString("matric_number") + "\t"
                        + result.getInt("year_stud") + "\t"
                        + result.getString("student_group") + "\t"
                        + result.getInt("note1") + "\t"
                        + result.getInt("note2") + "\t"
                        + result.getInt("note3") + "\t"
                        + result.getFloat("average"));
            }
            connection.close();
            statement.close();
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
