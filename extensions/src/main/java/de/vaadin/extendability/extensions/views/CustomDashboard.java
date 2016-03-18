package de.vaadin.extendability.extensions.views;

import com.vaadin.ui.Label;

import de.vaadin.extendability.api.Dashboard;

public class CustomDashboard extends Label implements Dashboard {

    CustomDashboard(){
        super("this is the custom dashboard");
    }
}
