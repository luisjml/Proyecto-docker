package com.proyectod.proyectoDocker;

import com.proyectod.proyectoDocker.entities.User;
import com.proyectod.proyectoDocker.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {
    private UserRepository userRepository;

    public DBSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User luis = new User(
                "Luis"
        );

        User carlos = new User(
                "carlos"
        );
        //drop all usuarios
        this.userRepository.deleteAll();

        //add our usuarios to database
        List<User> users = Arrays.asList(luis,carlos);
        this.userRepository.saveAll(users);

    }
}
