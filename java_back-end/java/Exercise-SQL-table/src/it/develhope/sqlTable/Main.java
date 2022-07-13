package it.develhope.sqlTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * # Exercise - SQL-table
 * before doing this exercise, you have to complete `0-SQL-installation-and-user-permissions`
 * add JDBC to IntelliJ following [this tutorial](https://www.youtube.com/watch?v=e8g9eNnFpHQ), till minute 3.35
 * [here](https://dev.mysql.com/downloads/connector/j/) you can find the connector mentioned in the tutorial to download
 * create a class where you:
 * create a connection to the `newdb` database:
 *    using the `DriverManager`
 *    following [this tutorial](https://www.mysqltutorial.org/connecting-to-mysql-using-jdbc-driver/)
 *    using the following parameters:
 *    `DB_URL`: `jdbc:mysql://localhost:3306/newdb` database
 *    `USER`: the MySQL `developer` user
 *    `PASSWORD`: the password you use for the MySQL `developer` user
 * create a table `students` if not already existing with
 *    the following columns:
 *    `student_id` as integer (10 digits) that is `NOT NULL AUTO_INCREMENT`
 *    `last_name` as string (max 30 characters)
 *    `first_name` as string (max 30 characters)
 * the constraint that `students_pk` is the `PRIMARY KEY` using only the column `student_id`
 * populate the table with 4 random students
 * remember that you need only to insert `last_name` and `first_name` because the primary key is auto-incremented
 *
 * @author Alessandro Canulli
 */
public class Main {

    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/newdb";
    static final String USER = "developer";
    static final String PASSWORD = "developer1";

    public static void main(String[] args) {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

            Statement statement = connection.createStatement();

            String createQuery = """
                    CREATE TABLE IF NOT EXISTS students
                    (
                      student_id INT(10) NOT NULL AUTO_INCREMENT,
                      last_name VARCHAR(30),
                      first_name VARCHAR(25),
                      
                      CONSTRAINT students_pk PRIMARY KEY (student_id)
                    );
                    """;

            statement.executeUpdate(createQuery);
            System.out.println("-----------------------Created table-----------------------");

            String populateQuery = """
                    INSERT INTO students (last_name, first_name)
                    VALUES ('Canulli', 'Alessandro'),('Ciaceri', 'Arturo'),('Rossi', 'Marco'),('Curridori', 'Sonia');
                    """;

            statement.executeUpdate(populateQuery);
            System.out.println("----------------------Table populated----------------------");

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(connection != null) {
                    connection.close();
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}