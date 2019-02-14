package com.company.Models;

import java.sql.*;
import java.util.ArrayList;

public class MagasinModel {

    private static MagasinController magasinController;


    static final String DB_URL = "jdbc:mysql://localhost:3306";
    static final String USER = "root";
    static final String PASS = "";
    private static Connection conn = null;


    public MagasinModel() {

    }


    public boolean connectToDataBase() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.gjt.mm.mysql.Driver");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        //STEP 3: Open a connection
        System.out.print("Connecting to database...   ");

        try {

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Success");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public ArrayList<Product> getAllProductsFromDataBase() {

        Statement stmt = null;
        System.out.print("Getting products From DataBase.......   ");

        ArrayList<Product> products = new ArrayList<>();
        try {
            stmt = conn.createStatement();

            String sql;
            sql = "USE wrpracti_northwind;";

            stmt.executeQuery(sql);

            sql = "SELECT ProductID,ProductName,UnitPrice,CategoryName,UnitsInStock,UnitPrice\n" +
                    "FROM Products\n" +
                    "JOIN Categories C on Products.CategoryID = C.CategoryID;";

            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()) {
                //Retrieve by column name
                Product product = new Product();
                product.setProductID(rs.getInt("ProductID"));
                product.setProductName(rs.getString("ProductName"));
                product.setUnitPrice(rs.getFloat("UnitPrice"));
                product.setCategoryName(rs.getString("CategoryName"));
                product.setUnitsInStock(rs.getInt("UnitsInStock"));

                products.add(product);

            }
            System.out.println("Done");

            return products;

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;

    }


    public boolean updateProduct(Product product) {

        Statement stmt = null;
        System.out.print("Getting products From DataBase.......   ");

        try {
            stmt = conn.createStatement();

            String sql;
            sql = "USE wrpracti_northwind;";

            stmt.executeQuery(sql);

            sql = "UPDATE Products" +
                    "SET ProductName = " + product.getProductName() + ", " +
                    "  UnitPrice = " + product.getUnitPrice() + ", " +
                    "  UnitsInStock = " + product.getUnitsInStock() + ", " +
                    "WHERE ProductID = " + product.getProductID() + ";";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Done");

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }

    public static void setMagasinController(MagasinController magasinController) {
        MagasinModel.magasinController = magasinController;
    }


}
