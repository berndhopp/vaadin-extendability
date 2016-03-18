package de.vaadin.extendability.vanilla.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Panel;

import de.vaadin.extendability.api.Dashboard;

@GuiceView(name = "")
public class DashboardView extends Panel implements View {

    @Inject
    DashboardView(Dashboard dashboard){
        setContent(dashboard);
        setSizeFull();
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
    }
}
