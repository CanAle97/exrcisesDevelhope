package it.develhope.sqlAlter;

import java.sql.*;
import java.sql.SQLException;

/**
 * # Exercise - SQL-alter
 * before doing this exercise, you have to complete the following exercises:
 * `0-SQL-installation-and-user-permissions`
 * `SQL-table`
 * `SQL-select`
 * use *JDBC* for executing a query on the `jdbc:mysql://localhost:3306/newdb` database that:
 * adds a new string column of 30 chars called `country` to the `students` table
 * populate the new column with `Italy` for 2 students and `Germany` for the other 2 students
 *
 * @author Alessandro Canulli
 */

public class Main {

    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/newdb";
    static final String USER = "root";
    static final String PASSWORD = "PucciSpulci5@";

    public static void main(String[] args) {

        Connection connection = null;
        try {

            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

            Statement statement = connection.createStatement();

            String alterTable = """
                ALTER TABLE students
                ADD country VARCHAR(30);
                """;

            statement.executeUpdate(alterTable);
            System.out.println("----------Altered table----------");

            String populateQuery1 = """
                UPDATE students
                SET country = 'Italy'
                WHERE last_name = 'Rossi';                                   
                """;

            String populateQuery2 = """
                UPDATE students
                SET country = 'Italy'
                WHERE last_name = 'Canulli'; 
                """;

            String populateQuery3 = """
                UPDATE students
                SET country = 'Germany'
                WHERE last_name = 'Curridori';   
                """;

            String populateQuery4 = """
                UPDATE students
                SET country = 'Germany'
                WHERE last_name = 'Ciaceri'; 
                """;

            statement.executeUpdate(populateQuery1);
            statement.executeUpdate(populateQuery2);
            statement.executeUpdate(populateQuery3);
            statement.executeUpdate(populateQuery4);

            System.out.println("----------Column populated----------");

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