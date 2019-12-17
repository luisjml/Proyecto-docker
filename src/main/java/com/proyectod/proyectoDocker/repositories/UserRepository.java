package com.proyectod.proyectoDocker.repositories;

import com.proyectod.proyectoDocker.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
