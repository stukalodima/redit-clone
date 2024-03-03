package com.best.team.reditclone.view.user;

import com.best.team.reditclone.entity.User;
import com.best.team.reditclone.service.UserService;
import com.best.team.reditclone.view.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("user-detail")
public class UserDetailView extends VerticalLayout {

    private TextField username = new TextField("Username");
    private TextField firstName = new TextField("First Name");
    private TextField lastName = new TextField("Last Name");
    private TextField password = new TextField("Password");
    private TextField email = new TextField("Email");

    private final UserService userService;

    public UserDetailView(UserService userService) {
        this.userService = userService;
        add(username, firstName, lastName, password, email);
        Button save = new Button("Save", e -> {
            User user = User.with()
                    .login(username.getValue())
                    .password(password.getValue())
                    .firstName(firstName.getValue())
                    .lastName(lastName.getValue())
                    .email(email.getValue())
                    .build();
            userService.save(user);
            this.getUI().ifPresent(ui -> ui.navigate(MainView.class));
        });
        add(save);
    }

    public void editUser(User user) {
        if (user == null) {
            return;
        }
        username.setValue(user.getLogin());
        firstName.setValue(user.getFirstName());
        lastName.setValue(user.getLastName());
        password.setValue(user.getPassword());
        email.setValue(user.getEmail());
    }
}
