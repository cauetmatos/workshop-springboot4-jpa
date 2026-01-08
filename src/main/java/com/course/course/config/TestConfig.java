package com.course.course.config;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.course.course.entities.User;
import com.course.course.repositories.UserRepository;

@Configuration
@Profile("test") // Isso garante que o código só rode quando você estiver usando o application-test.properties
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;

    // Injeção de dependência automática
    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Flor", "maria2026@gmail.com", "1399145758", "123456maria");
        User u2 = new User(null, "Jhonathan Silva", "jhowjhow1523@gmail.com", "1198535589", "45623165");

        userRepository.saveAll(Arrays.asList(u1, u2));
        System.out.println("Banco de dados semeado com sucesso!");
    }
}