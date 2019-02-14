package com.company.Models;

import com.company.Views.MagasinView;

import java.util.ArrayList;

public class MagasinController {

    MagasinModel magasinModel;
    MagasinView magasinView;

    public void setMagasinModel(MagasinModel magasinModel) {
        this.magasinModel = magasinModel;
    }

    public void setMagasinView(MagasinView magasinView) {
        this.magasinView = magasinView;
    }

    public void init() {

        if (!magasinModel.connectToDataBase()){
            System.out.println("Please check the connection");
        }
        else {

        magasinView.initWindow();




        }

    }

    public ArrayList<Product> getProducts() {
        return magasinModel.getAllProductsFromDataBase();
    }
}
