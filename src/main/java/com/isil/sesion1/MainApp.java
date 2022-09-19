package com.isil.sesion1;

import java.sql.*;

public class MainApp {

    public static void main(String[] args) throws Exception {

        //PASO1 importar el driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        //PASO2 establecer la coneccion a la base de datos

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/TEST",
                "root",
                "root"
        );

        //PASO3 creacion de un statement que me va a permitir ejecutar querys

        Statement stmt= con.createStatement();
        //HACER UN UPDATE
        int resulUpdate = stmt.executeUpdate("update Users set phone='44445444' where name='Messi'");

        //HACER UN SELECT *
        ResultSet result = stmt.executeQuery("select * from Users");

        while (result.next()){
            //PARA MOSTRAR UN REGISTRO EN ESPECÍFICO
            if (result.getString("name").equals("Ronaldo")){
                System.out.println(result.getString("idUser"));
                System.out.println(result.getString("name"));
                System.out.println(result.getString("phone"));
                System.out.println(result.getString("city"));
            }


        }
    }
}
