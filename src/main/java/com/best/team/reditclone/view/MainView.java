package com.best.team.reditclone.view;

import com.best.team.reditclone.entity.User;
import com.best.team.reditclone.service.UserService;
import com.best.team.reditclone.view.user.UserDetailView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("")
@PageTitle("Reddit Clone")
public class MainView extends VerticalLayout {

    private Grid<User> userGrid = null;
    private final UserService userService;

    public MainView(UserService userService) {
        this.userService = userService;
        add(new H1("Welcome to the Reddit Clone"));

        Button users = new Button("Get all users", e -> {
            userGrid.setItems(userService.list());
        });

        add(users);

        Button addUser = new Button("Add user", e -> {
            this.getUI().ifPresent(ui -> {
                ui.navigate(UserDetailView.class)
                        .ifPresent(editor -> editor.editUser(null));
            });
        });

        Button editUser = new Button("Edit user", e -> {
            this.getUI().ifPresent(ui -> {
                ui.navigate(UserDetailView.class)
                        .ifPresent(editor -> editor.editUser(userGrid.asSingleSelect().getValue()));
            });
        });

        add(addUser);
        add(editUser);

        userGrid = new Grid<>();
        userGrid.addColumn(User::getLogin).setHeader("Username");
        userGrid.addColumn(User::getFirstName).setHeader("First Name");
        userGrid.addColumn(User::getLastName).setHeader("Last Name");
        userGrid.addColumn(User::getEmail).setHeader("Email");
        add(userGrid);

    }
}
