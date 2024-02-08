package jdbcProject.application;

import java.sql.Connection;

import jdbcProject.db.DB;


public class Program {
    public static void main(String[]args){
        Connection conn = DB.getConnection();


        DB.closeConnection();
    }
}
