/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI
@Theme("valo")
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        
        //Un Layout Vertical
        
        VerticalLayout vl = new VerticalLayout();

        //Una etiqueta vaadin
        Label etiqueta = new Label("Hola mundo vaadin Fernando");
        //Un boton 
        Button boton = new Button("Apachurrame!");
        //Ponemos un estilo al boton
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        //Vamos a manejar un evento de boton del tipo click
        boton.addClickListener(/*nombre del evento*/algo->{
            //Aqui ponemos la funcion
            Notification.show("Yo soy una notificación", Notification.Type.WARNING_MESSAGE);
        });
        
        vl.addComponent(etiqueta);
        vl.addComponent(boton);
        setContent(vl);
    }
    
}
