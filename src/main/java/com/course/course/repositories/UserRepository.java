package com.course.course.repositories;

import com.course.course.entities.User; // Este import deve parar de ficar vermelho agora
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}