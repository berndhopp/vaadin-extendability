package de.vaadin.extendability.extensions.cdi;

import com.google.inject.AbstractModule;

import com.vaadin.guice.annotation.UIModule;

import de.vaadin.extendability.api.Dashboard;
import de.vaadin.extendability.extensions.views.CustomDashboard;

@UIModule
public class ExtensionModule extends AbstractModule {
    protected void configure() {
        bind(Dashboard.class).to(CustomDashboard.class);
    }
}
