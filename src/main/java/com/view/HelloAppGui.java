package com.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloAppGui extends VerticalLayout {


    public HelloAppGui() {
        TextField textField=new TextField("Give your name: ");
        Button button=new Button("Welcome ", new Icon(VaadinIcon.HANDSHAKE));
        Label label=new Label();

button.addClickListener(click ->{
    label.setText("Hello " + textField.getValue());
    Image image=new Image("https://media.tenor.com/images/1170597818a37a7c6e3e1d4baeb6e2eb/tenor.gif", "Hello ");
add(image);
});

add(textField, button, label);
    }
}
