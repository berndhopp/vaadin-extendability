package de.vaadin.extendability.vanilla;

import com.google.inject.Inject;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.guice.annotation.Configuration;
import com.vaadin.guice.annotation.GuiceUI;
import com.vaadin.guice.annotation.ViewContainer;
import com.vaadin.guice.server.GuiceVaadinServlet;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

import de.vaadin.extendability.vanilla.cdi.MyModule;

import javax.servlet.annotation.WebServlet;

@Theme("mytheme")
@Widgetset("de.vaadin.extendability.MyAppWidgetset")
@GuiceUI
public class MyUI extends UI {

    @Inject
    @ViewContainer
    private MyViewContainer myViewContainer;

    @Inject
    private MyApplication myApplication;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(myApplication);
    }

    @Configuration(modules = MyModule.class, basePackages = "de.vaadin.extendability")
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends GuiceVaadinServlet {
    }
}
