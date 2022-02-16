package com.database;


    import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

        public class DBJahidul {

        public static void main(String[] args) throws SQLException {
            connectPostgresql();
        }

        public static void connectPostgresql() throws SQLException {
            String userName = "postgres";
            String password = "@Bangladesh1995";
            String hostName = "localhost";
            String portNumber = "5432";
            String database = "dvdrental";
            String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor;";
            // jdbc:postgresql://host:port/database
            // protocol://host:post/resource
            String url = "jdbc:postgresql://" + hostName +":"+ portNumber + "/" + database ;

            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

       while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name"));
      }
/*
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

            System.out.println(listOfRecord.size());
            //listOfRecord.get(199);

            for ( Map<String, String> map : listOfRecord) {
                for(Map.Entry<String, String> entry : map.entrySet()){
                    System.out.println(entry.getKey() + ", " + entry.getValue());
                }
            }

*/


        }
    }


