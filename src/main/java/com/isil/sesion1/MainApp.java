package com.isil.sesion1;

import java.sql.*;

public class MainApp {

    public static void main(String[] args) throws Exception {


        // 1. Cargar driver
        //PASO1 importar el driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        // 1. CREAR CONEXION

        //PASO2 establecer la coneccion a la base de datos

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/TEST",
                "root",
                "root"
        );

        // 3. CREAR STATEMENT

        //PASO3 creacion de un statement que me va a permitir ejecutar querys


        // 4.EJECUTAR QUERY

        //HACER UN UPDATE


        //HACER UN SELECT *



        //5. RECORRER RESULTADO



        //CREANDO UN NUEVO STATEMENT
        Statement stmt2= con.createStatement();
        ResultSet resultSet = stmt2.executeQuery("select * from Users where name='Ronaldo'");

        while (resultSet.next()){

                System.out.println(resultSet.getString("name") + "\n" +
                        resultSet.getString("phone")+"\n"+
                        resultSet.getString("city"));
        }

        //6.CERRAR CONEXION

        con.close();

    }
}
