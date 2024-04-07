package com.best.team.reditclone.view.mainView;

import com.best.team.reditclone.ReditCloneApplication;
import com.best.team.reditclone.entity.User;
import com.best.team.reditclone.service.PostService;
import com.best.team.reditclone.service.SubReditService;
import com.best.team.reditclone.view.mainView.component.Body;
import com.best.team.reditclone.view.mainView.component.TopPanelComponent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;

@Route("")
@PageTitle("Reddit Clone")
public class MainView extends VerticalLayout {
    private final SubReditService subReditService;
    private final PostService postService;
    public MainView(SubReditService subReditService, PostService postService) throws FileNotFoundException {
        this.subReditService = subReditService;
        this.postService = postService;

        TopPanelComponent topPanelComponent = new TopPanelComponent();
        add(topPanelComponent);

        final Body body = new Body(subReditService,postService);
        add(body);

        setHeight("100%");
    }
}
