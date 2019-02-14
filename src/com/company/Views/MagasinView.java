package com.company.Views;

import com.company.Models.MagasinController;
import com.company.Models.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class MagasinView {

    MagasinController magasinController;
    private JPanel p_actionPanel;
    private JPanel p_panelLeft;
    private JPanel p_panelRight;
    private JPanel p_panelCentral;
    private JTable table_Produits;

    public void setMagasinController(MagasinController magasinController) {
        this.magasinController = magasinController;
    }

    public void initWindow(){

        JFrame window = new JFrame("Magasin");
        window.setContentPane(p_actionPanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        window.setSize(1024,640);
        window.setLocationRelativeTo(null);

        loadProductsCentralPanel();

    }

    private void loadProductsCentralPanel() {

        ArrayList<Product> products = magasinController.getProducts();

        String[] columnNames = {"Product Name", "Category Name", "Price"};

        Object[][] data = new Object[products.size()][4];


        int index = 0;
        for(Product temp : products) {
            data[index][0] = temp.getProductName();
            data[index][1] = temp.getCategoryName();
            data[index][2] = temp.getUnitPrice();
            index++;
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table_Produits.setModel(model);
        table_Produits.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        table_Produits.getColumnModel().getColumn(0).setMinWidth(180);



    }
}
