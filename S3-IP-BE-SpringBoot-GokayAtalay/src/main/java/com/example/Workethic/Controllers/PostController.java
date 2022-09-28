package com.example.Workethic.Controllers;

import com.example.Workethic.Models.Post;
import com.example.Workethic.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/")
    public ResponseEntity<?> index() {
        List<Post> posts = postRepository.All();
        return ResponseEntity
                .ok()
                .body(posts);
    }
}