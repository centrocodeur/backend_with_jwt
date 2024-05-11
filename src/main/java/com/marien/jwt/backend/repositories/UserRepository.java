package com.marien.jwt.backend.repositories;

import com.marien.jwt.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long> {

    Optional<User> findByLogin(String login);

}
