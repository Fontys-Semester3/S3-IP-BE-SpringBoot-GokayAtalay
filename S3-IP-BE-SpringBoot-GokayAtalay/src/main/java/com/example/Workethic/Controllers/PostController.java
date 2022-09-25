package com.example.Workethic.Controllers;

import com.example.Workethic.Models.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @RequestMapping("/")
    public List<Post> index() {

        List<Post> posts = new ArrayList<>();

        posts.add(new Post("dfghdkfjhg", "Ik heb iets nodig", "Ik heb iets nodig Ik heb iets nodig", LocalDateTime.now()));
        posts.add(new Post("fdiogjdfgo", "Mijn lampen zijn kapot", "Mijn lampen zijn kapot Mijn lampen zijn kapot", LocalDateTime.now()));
        posts.add(new Post("oruyfgnfnk", "Mijn hond praat teveel", "Mijn hond praat teveel Mijn hond praat teveel", LocalDateTime.now()));
        posts.add(new Post("eroiutfidb", "Waarom verkopen AH & Jumbo geen Monster Energy meer gvd", "Waarom verkopen AH & Jumbo geen Monster Energy meer gvd Waarom verkopen AH & Jumbo geen Monster Energy meer gvd", LocalDateTime.now()));

        return posts;
    }
}
