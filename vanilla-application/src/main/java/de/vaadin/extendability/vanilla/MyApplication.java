package de.vaadin.extendability.vanilla;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

@UIScope
public class MyApplication extends VerticalLayout{

    @Inject
    MyApplication(ViewSelector viewSelector, MyViewContainer myViewContainer){
        addComponents(viewSelector, myViewContainer);
        setComponentAlignment(viewSelector, Alignment.TOP_LEFT);

        setExpandRatio(myViewContainer, 1);
        setSizeFull();
    }
}
