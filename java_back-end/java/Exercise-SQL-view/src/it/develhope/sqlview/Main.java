package it.develhope.sqlview;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *# Exercise - SQL-view
 *  before doing this exercise, you have to complete before the following exercises:
 *    `0-SQL-installation-and-user-permissions`
 *    `SQL-table`
 *    `SQL-Select`
 *    `SQL-alter`
 *
 *  use *JDBC* for executing the following queries on the `jdbc:mysql://localhost:3306/newdb` database:
 *    create a view `italian_students` that gets all the name and surname of the Italian students
 *    create a view `german_students` that gets all the name and surname of the German students
 *    execute a select using the the `italian_students` and put the result in an `ArrayList` of `Student` objects called `italianStudents`
 *    execute a select using the the `german_students` and put the result in an `ArrayList` of `Student` objects called `germanStudents`
 *
 * @author Alessandro Canulli
 */

public class Main {

    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/newdb";
    static final String USER = "developer";
    static final String PASSWORD = "developer1";

    public static void main(String[] args) {

        Connection connection = null;
        List<Students> italianStudents = new ArrayList<>();
        List<Students> germanStudents = new ArrayList<>();

        try {

            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

            Statement statement = connection.createStatement();

            String createItalianStudentsView = """
                    CREATE VIEW italian_students AS
                    SELECT first_name, last_name
                    FROM students
                    WHERE country = 'Italy';
                    """;

            String createGermanStudentsView = """
                    CREATE VIEW german_students AS
                    SELECT first_name, last_name
                    FROM students
                    WHERE country = 'Germany';
                    """;

            statement.executeUpdate(createItalianStudentsView);
            statement.executeUpdate(createGermanStudentsView);

            System.out.println("----------Created views----------");

            String useItalianStudentsView = """
                    SELECT * from italian_students;
                    """;

            ResultSet italianRes = statement.executeQuery(useItalianStudentsView);
            while(italianRes.next()){
                italianStudents.add(new Students(italianRes.getString("first_name"), italianRes.getString("last_name")));
            }

            String useGermanStudentsView = """
                    SELECT * from german_students;
                    """;
            ResultSet germanRes = statement.executeQuery(useGermanStudentsView);
            while(germanRes.next()){
                germanStudents.add(new Students(germanRes.getString("first_name"), germanRes.getString("last_name")));
            }


            System.out.println("Italian students: " + italianStudents);
            System.out.println("German students: " + germanStudents);

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(connection != null)
                    connection.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}