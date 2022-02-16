package com.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseDemo {
    public static void main(String[] args) throws SQLException {

    }

    public static void connectPostgresql() throws SQLException{
        String userName = "postgre" ;
        String password = "Bangladesh1995" ;
        String hostName = "localhost";
        String portNumber = "5432";
        String dataBase = "dvdrental";

        String query = "SELECT actor_id, first_name, last_name, last_update From public.actor;";

        // jdbc:postgresql://host:port/database  <-- one way to connect to the database
        //protocol://host:post/resource   <-- another way to connect to database
        // depending on the information provided there are other ways to connect to Database
        // methods to connect to database can be googled.

        String url = "jdbc:postgresql://" + hostName + ";" + portNumber + "/" + dataBase ;

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

/*
        while (resultSet.next()) {
              System.out.println(resultSet.getString("first_name"));
              */

// above logic does not work...

        List<Map<String, String>> listOfRecord = new ArrayList<>();
        Map<String, String> hashMap = new HashMap<>();
        while (resultSet.next()) {
            hashMap.put("actor_id", resultSet.getString("actor_id"));// hashMap.put("keyName", "value")
            hashMap.put("first_name", resultSet.getString("first_name"));
            hashMap.put("last_name", resultSet.getString("last_name"));
            hashMap.put("last_update", resultSet.getString("last_update"));
            listOfRecord.add(hashMap);
            // hashMap.clear();
        }


        }

    }

