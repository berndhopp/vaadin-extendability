package de.vaadin.extendability.extensions.views;

import com.vaadin.guice.annotation.GuiceUI;
import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;

@GuiceView(name = "pluggedInView")
public class PluggedInView extends Label implements View{
    PluggedInView(){
        super("this is the plugged-in view");
    }

    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
