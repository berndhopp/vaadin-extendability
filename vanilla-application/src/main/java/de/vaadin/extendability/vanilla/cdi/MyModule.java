package de.vaadin.extendability.vanilla.cdi;

import com.google.inject.AbstractModule;

import de.vaadin.extendability.api.Dashboard;
import de.vaadin.extendability.vanilla.DefaultDashboard;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Dashboard.class).to(DefaultDashboard.class);
    }
}
