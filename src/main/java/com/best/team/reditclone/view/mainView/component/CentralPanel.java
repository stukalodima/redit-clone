package com.best.team.reditclone.view.mainView.component;

import com.best.team.reditclone.entity.Post;
import com.best.team.reditclone.service.PostService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.virtuallist.VirtualList;
import com.vaadin.flow.data.renderer.ComponentRenderer;

public class CentralPanel extends VerticalLayout {
    private final PostService postService;

    public CentralPanel(PostService postService) {

        this.postService = postService;

        setWidth("100%");

        final VirtualList<Post> list = new VirtualList<>();

        list.setItems(postService.list());
        list.setRenderer(postRender);
        list.setWidth(600, Unit.PIXELS);

        add(list);

        expand(list);
    }


    private ComponentRenderer<Component, Post> postRender = new ComponentRenderer<>(
            post -> {
                final VerticalLayout layout = new VerticalLayout();
                final TextArea textArea = new TextArea(post.getName());
                textArea.setValue(post.getDescription());
                textArea.setEnabled(false);
                textArea.setWidth("100%");
                textArea.setMinHeight("300Px");
                layout.add(textArea);
                return layout;
            });
}
