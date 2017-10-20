package com.urban.microservices.urbanservice;

import com.urban.microservices.urbanservice.dto.AccountBuilder;
import com.urban.microservices.urbanservice.repo.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class UrbanServiceApplication {

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository) {

        return Strings -> Stream.of("John", "Jane", "Hernan", "mike")
                .map(s -> new AccountBuilder()
                        .setAge(35)
                        .setName(s)
                        .setEmail(s + "@gmail.com").build())
                .forEach(a -> accountRepository.save(a));
    }


    public static void main(String[] args) {
        SpringApplication.run(UrbanServiceApplication.class, args);
    }
}
