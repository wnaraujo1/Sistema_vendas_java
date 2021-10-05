package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conecta {
//private Connection conexao;     
private final String URL = "jdbc:mysql://localhost:3306/WellingtonAraujo?useSSL=false";
private final String USER = "root";
private final String PASSWORD = "root";

public Connection getConnection() {
      try {
          return DriverManager.getConnection(URL,USER,PASSWORD);
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
  }
}
