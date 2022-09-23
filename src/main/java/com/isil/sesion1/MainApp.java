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


/*
        //CREANDO UN NUEVO STATEMENT
        Statement stmt2= con.createStatement();
        ResultSet resultSet = stmt2.executeQuery("select * from Users where name='Ronaldo'");

        while (resultSet.next()){

                System.out.println(resultSet.getString("name") + "\n" +
                        resultSet.getString("phone")+"\n"+
                        resultSet.getString("city"));
        }

        //USANDO PREARE STATEMENT

 */
/*
        PreparedStatement preparedStatement =
                con.prepareStatement("select * from Users where name=?");

        preparedStatement.setString(1,"Jugador3");

        ResultSet resultSet2 = preparedStatement.executeQuery();

        while (resultSet2.next()){
            System.out.println(resultSet2.getString("name")+ "\n"+
                    resultSet2.getString("phone")+"\n"+
                    resultSet2.getString("city"));
        }
*/

        /*

        //USANDO PREARE STATEMENT con dos parametros de busqueda

        PreparedStatement preparedStatement =
                con.prepareStatement("select * from Users where name=? and city=?");

        preparedStatement.setString(1,"Jugador3");
        preparedStatement.setString(2,"Medellin");

        ResultSet resultSet2 = preparedStatement.executeQuery();

        while (resultSet2.next()){
            System.out.println(resultSet2.getString("name")+ "\n"+
                    resultSet2.getString("phone")+"\n"+
                    resultSet2.getString("city"));
        }
*/
        /*
        //USANDO STATEMENT E INSERTANDO UN DATO (FILAS DE MANTENIMIENTO)

        Statement stCreate = con.createStatement();
        int filasAfectadas=
                stCreate.executeUpdate("INSERT INTO Users VALUES (5,'Elizabeth','34667852','Tokio')");
        System.out.println("Filas afectadas: "+ filasAfectadas);
        PreparedStatement preparedStatement =
                con.prepareStatement("select * from Users where name=?");

        preparedStatement.setString(1,"Elizabeth");

        ResultSet resultSet2 = preparedStatement.executeQuery();
        //Recorre los resultados
        while (resultSet2.next()){
            System.out.println(resultSet2.getString("name") + "\n"+
                    resultSet2.getString("phone") +"\n"+
                    resultSet2.getString("city"));
        }
*/

        //USANDO PREPARED STATEMENT - UPDATE (FILAS DE MANTENIMIENTO)




        //6.CERRAR CONEXION

        con.close();

    }
}
