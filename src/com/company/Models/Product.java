package com.company.Models;

public class Product {

    private int ProductID;
    private String ProductName;
    private String CategoryName;
    private int UnitsInStock;
    private float UnitPrice;

    public Product() {
    }

    public Product(int productID, String productName, String categoryName, int unitsInStock, float unitPrice) {
        ProductID = productID;
        ProductName = productName;
        CategoryName = categoryName;
        UnitsInStock = unitsInStock;
        UnitPrice = unitPrice;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public int getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        UnitsInStock = unitsInStock;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        UnitPrice = unitPrice;
    }
}
