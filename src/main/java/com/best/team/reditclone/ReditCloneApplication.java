package com.best.team.reditclone;

import com.best.team.reditclone.repository.SubReditRepository;
import com.best.team.reditclone.service.SubReditService;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Theme("reddit")
public class ReditCloneApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(ReditCloneApplication.class, args);
    }

    @Bean
    @Primary
    SubReditService subReditService(SubReditRepository repository) {
        return new SubReditService(repository);
    }

}
