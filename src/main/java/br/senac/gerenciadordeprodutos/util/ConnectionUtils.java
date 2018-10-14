/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.senac.gerenciadordeprodutos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: Ezaú de Matos Brito  <ezau.mbrito@gmail.com>
 * @version:
 * Main Class File:
 * File: ConnectionUtils.java
 * Date: Oct 13, 2018
 */
public class ConnectionUtils {
    private static  Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/PRODUTOBD";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
     public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection(URL,USER,PASSWORD);

        return connection;
    }
}
