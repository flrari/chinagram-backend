package com.chinagram.chinagram_backend.repository;

import com.chinagram.chinagram_backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
