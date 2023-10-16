package utils;

import java.sql.*;

public class DBUtil {
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "root";
    public static final  String DB_URL = "jdbc:mysql://127.0.0.1:3308/users_db";

    private DBUtil(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void release(Connection connection, Statement statement, ResultSet resultSet){
        try{
            if (connection != null){
                System.out.println("Connection " + connection + " is closed ");
                connection.close();
            }
            if (statement != null){
                System.out.println("Statement " + statement + " is closed ");
                statement.close();
            }
            if (resultSet != null){
                System.out.println("ResultSet " + resultSet + " is closed ");
                resultSet.close();
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
