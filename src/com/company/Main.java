package com.company;

import com.company.Models.MagasinController;
import com.company.Models.MagasinModel;

public class Main {

    public static void main(String[] args) {

        MagasinModel magasinModel = new MagasinModel();
        MagasinController magasinController = new MagasinController();
        magasinController.setMagasinModel(magasinModel);
        magasinModel.setMagasinController(magasinController);

        magasinController.init();


	// write your code here
    }
}
