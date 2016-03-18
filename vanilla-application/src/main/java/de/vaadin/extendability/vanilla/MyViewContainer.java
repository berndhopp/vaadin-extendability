package de.vaadin.extendability.vanilla;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Panel;

@UIScope
public class MyViewContainer extends Panel {
    MyViewContainer(){
        setSizeFull();
    }
}
