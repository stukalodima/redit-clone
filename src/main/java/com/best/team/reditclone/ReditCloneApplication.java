package com.best.team.reditclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ReditCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReditCloneApplication.class, args);
    }

}
