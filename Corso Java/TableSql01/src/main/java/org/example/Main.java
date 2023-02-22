package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/newdb";
        String username="developer";
        String password="passwordhere";
        PreparedStatement ps=null;
        Connection connection=null;

        try {
            connection= DriverManager.getConnection(url,username,password);

            String query="CREATE TABLE if not exists `newdb`.`students` (\n" +
                    "  `student_id` INT(10) NOT NULL AUTO_INCREMENT,\n" +
                    "  `last_name` VARCHAR(30) NULL,\n" +
                    "  `first_name` VARCHAR(30) NULL,\n" +
                    "  constraint students_pk PRIMARY KEY (student_id));";
            ps=connection.prepareStatement(query);
            ps.execute();

            String students1 = "INSERT INTO`newdb`.`students` (`first_name`,`last_name`) VALUES ('Francesco','Amarena')";
            ps=connection.prepareStatement(students1);
            ps.execute();

            String students2 = "INSERT INTO`newdb`.`students` (`first_name`,`last_name`) VALUES ('Antonio','Rossi')";
            ps=connection.prepareStatement(students2);
            ps.execute();

            String students3 = "INSERT INTO`newdb`.`students` (`first_name`,`last_name`) VALUES ('Michele','Patanella')";
            ps=connection.prepareStatement(students3);
            ps.execute();

            String students4 = "INSERT INTO`newdb`.`students` (`first_name`,`last_name`) VALUES ('Ernesto','Navazio')";
            ps=connection.prepareStatement(students4);
            ps.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}