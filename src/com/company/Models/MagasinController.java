package com.company.Models;

public class MagasinController {

    MagasinModel magasinModel;

    public void setMagasinModel(MagasinModel magasinModel) {
        this.magasinModel = magasinModel;
    }

    public void init() {

        if (!magasinModel.connectToDataBase()){
            System.out.println("Please check the connection");
        }
        else {






        }

    }
}
