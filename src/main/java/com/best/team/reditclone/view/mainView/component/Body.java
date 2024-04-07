package com.best.team.reditclone.view.mainView.component;

import com.best.team.reditclone.service.PostService;
import com.best.team.reditclone.service.SubReditService;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class Body extends HorizontalLayout {
    private final SubReditService subReditService;
    private final PostService postService;

    public Body(SubReditService subReditService, PostService postService) {
        this.subReditService = subReditService;
        this.postService = postService;

        setWidth("100%");

        final LeftPanel leftPanel = new LeftPanel(subReditService);
        final RightPanel rightPanel = new RightPanel();
        final CentralPanel centralPanel = new CentralPanel(postService);

        add(leftPanel, centralPanel, rightPanel);

        expand(centralPanel);
        setHeight("100%");
    }
}
