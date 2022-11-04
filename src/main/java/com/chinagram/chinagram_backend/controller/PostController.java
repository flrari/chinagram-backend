package com.chinagram.chinagram_backend.controller;


import com.chinagram.chinagram_backend.model.Post;
import com.chinagram.chinagram_backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/post")
public class PostController{

    @Autowired
    PostService postService;

    @GetMapping("/all")
    public List<Post> getAllPosts() {
        return postService.findAllPosts();
    }
}