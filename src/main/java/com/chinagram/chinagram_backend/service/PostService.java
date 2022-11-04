package com.chinagram.chinagram_backend.service;

import com.chinagram.chinagram_backend.model.Post;
import com.chinagram.chinagram_backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> findAllPosts(){
        return postRepository.findAll();
    }
}
