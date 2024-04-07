package com.best.team.reditclone.view.mainView.component;

import com.best.team.reditclone.entity.SubRedit;
import com.best.team.reditclone.service.SubReditService;
import com.best.team.reditclone.view.mainView.MainView;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;

import java.util.List;

public class LeftPanel extends VerticalLayout {
    private final SubReditService subReditService;
    public LeftPanel(SubReditService subReditService) {
        this.subReditService = subReditService;

        final SideNav sideNav = new SideNav();

        sideNav.addItem(new SideNavItem("HOME", MainView.class, VaadinIcon.HOME.create()));
        sideNav.addItem(new SideNavItem("POPULAR", "populate", VaadinIcon.STAR.create()));

        final SideNavItem topics = new SideNavItem("Topics");

        final List<SubRedit> subredditList = subReditService.list();
        for (final SubRedit subRedit : subredditList) {
            topics.addItem(new SideNavItem(subRedit.getName(), ""));
        }

        sideNav.addItem(topics);
        add(sideNav);
    }
}
