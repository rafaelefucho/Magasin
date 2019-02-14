package com.company;

import com.company.Models.MagasinController;
import com.company.Models.MagasinModel;
import com.company.Views.MagasinView;

public class Main {

    public static void main(String[] args) {

        MagasinModel magasinModel = new MagasinModel();
        MagasinView magasinView = new MagasinView();
        MagasinController magasinController = new MagasinController();


        //Connected the Model, the View and the Controller

        magasinController.setMagasinModel(magasinModel);
        magasinController.setMagasinView(magasinView);
        magasinModel.setMagasinController(magasinController);
        magasinView.setMagasinController(magasinController);



        magasinController.init();


	// write your code here
    }
}
