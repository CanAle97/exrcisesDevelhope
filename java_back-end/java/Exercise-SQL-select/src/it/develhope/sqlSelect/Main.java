package it.develhope.sqlSelect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * # Exercise - SQL-select
 * before doing this exercise, you have to complete `0-SQL-installation-and-user-permissions` and `SQL-table` exercises
 *  use *JDBC* for executing the following query on the `jdbc:mysql://localhost:3306/newdb` database:
 *  take the names and surnames of all the students (using `ResultSet` and its `.next()` method) and:
 *  print the names on screen while executing the query
 *  assign the surnames to an ArrayList called `surnames`
 *  once the query is completed, print all the `surnames`
 *
 * @author Alessandro Canulli
 */

public class Main {

    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/newdb";
    static final String USER = "developer";
    static final String PASSWORD = "developer1";

    public static void main(String[] args) {

        Connection connection = null;
        List<String> surnames = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

            Statement statement = connection.createStatement();

            String selectNameAndSurname = """
                    SELECT last_name, first_name FROM students;
                    """;

            ResultSet result = statement.executeQuery(selectNameAndSurname);

            while(result.next()){
                System.out.println("Names: " + result.getString("first_name"));
                surnames.add(result.getString("last_name"));
            }

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

        System.out.println("Surnames: " + surnames);
    }
}