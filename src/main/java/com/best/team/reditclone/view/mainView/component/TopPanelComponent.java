package com.best.team.reditclone.view.mainView.component;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

import java.io.FileNotFoundException;

public class TopPanelComponent extends HorizontalLayout {
    public TopPanelComponent() throws FileNotFoundException {

        setJustifyContentMode(JustifyContentMode.BETWEEN);
        setAlignItems(Alignment.CENTER);
        setWidth("100%");

        //Logo
        Image logo = new Image("static/image/logo.jpg", "Reddit Clone logo");
        logo.setHeight("40px");
        add(logo);

        final Span redditText = new Span("reddit");

        redditText.getStyle().setFontSize("32px");

        add(redditText);

        //Search bar
        TextField search = new TextField("Search");
        search.setPlaceholder("Search Reddit");
        search.setWidthFull();
        search.setPrefixComponent(VaadinIcon.SEARCH.create());
        search.setClassName("search-field");

        add(search);

        //Login button
        Button login = new Button("Login");
        login.setSuffixComponent(VaadinIcon.USER.create());
        add(login);
    }
}
