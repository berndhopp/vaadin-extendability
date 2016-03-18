package de.vaadin.extendability.vanilla;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.AllKnownGuiceViews;
import com.vaadin.guice.annotation.GuiceUI;
import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.navigator.View;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;

import java.util.Set;

@UIScope
public class ViewSelector extends MenuBar {
    @Inject
    ViewSelector(@AllKnownGuiceViews Set<View> views){
        for (View view : views) {
            GuiceView annotation = view.getClass().getAnnotation(GuiceView.class);
            addItem(annotation.name(), menuItem -> UI.getCurrent().getNavigator().navigateTo(annotation.name()));
        }

        setWidth("100%");
    }
}
