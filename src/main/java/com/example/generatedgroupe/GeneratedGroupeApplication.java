package com.example.generatedgroupe;

import com.example.generatedgroupe.entity.Admnistrateur;
import com.example.generatedgroupe.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class GeneratedGroupeApplication {

    @Autowired
    AdminRepository adminRepository;

    public static void main(String[] args) {
        SpringApplication.run(GeneratedGroupeApplication.class, args);
    }

    /*@Bean
    CommandLineRunner start (AdminRepository adminRepository){
        return args -> {
            Admnistrateur admnistrateur = new Admnistrateur("Test", "test@email.com","Test","test",1234);
            adminRepository.save(admnistrateur);
        };
    }*/
}
