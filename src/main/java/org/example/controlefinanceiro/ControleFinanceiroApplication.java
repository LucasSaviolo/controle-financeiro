package org.example.controlefinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.example.controlefinanceiro.repository")
public class ControleFinanceiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleFinanceiroApplication.class, args);
    }

}
