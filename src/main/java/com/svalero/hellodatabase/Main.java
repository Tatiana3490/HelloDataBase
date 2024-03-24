package com.svalero.hellodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public  static void main(String[] args){
        System.out.println("Hello database");

        Connection conexion = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/xe",
                    "usuario", "contraseña");
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (InstantiationException ie) {
            ie.printStackTrace();
        } catch (IllegalAccessException iae) {
            iae.printStackTrace();
        }
    }
}
