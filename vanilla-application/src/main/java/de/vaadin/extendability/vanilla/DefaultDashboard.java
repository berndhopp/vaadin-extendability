package de.vaadin.extendability.vanilla;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Label;

import de.vaadin.extendability.api.Dashboard;

@UIScope
public class DefaultDashboard extends Label implements Dashboard {
    DefaultDashboard(){
        super("this is the default dashboard");
    }
}
