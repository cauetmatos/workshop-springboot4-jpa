package com.course.course.config;


import com.course.course.entities.User;
import com.course.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")

public class configTest implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {  //method run vai ser executado
    User u1 = new User(null, "Maria Antonieta", "Mariajosh@gmail.com", "98888888", "1234567");
    User u2 = new User(null, "Alex Marron", "AlexSanches@gmail.com", "977777777", "123456789");

    userRepository.saveAll(Arrays.asList(u1,u2));
    }


}
