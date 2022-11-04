package com.chinagram.chinagram_backend.repository;

import com.chinagram.chinagram_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
