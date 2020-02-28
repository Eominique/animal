package com.view;

import com.controller.AnimalFactController;
import com.model.AnimalFact;
import com.controller.DogImage;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Route;

@Route("gui")
public class Gui extends VerticalLayout {


private AnimalFactController animalFactController;
private DogImage dogImage;

    public Gui(AnimalFactController animalFactController, DogImage dogImage) {
        this.animalFactController = animalFactController;
        this.dogImage = dogImage;



        Grid<AnimalFact> grid= new Grid<>(AnimalFact.class);
        grid.setItems(animalFactController.getAnimalFact());

        grid.addColumn(new ComponentRenderer<>(dog ->{
            Image image=new Image(dogImage.getDogImage(), " lack of image");
            image.setHeight("150px");
            return image;

        })).setHeader("Image");
grid.setHeight("1000px");

        add(grid);
    }


}
