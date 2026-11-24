package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeDatabase(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(null, "Amine SAFI", 23f));
            clientRepository.save(new Client(null, "Amal ALAOUI", 22f));
            clientRepository.save(new Client(null, "Samir RAMI", 22f));
        };
    }
}
