package com.project.security.controller.author;

import com.project.security.entity.author.AuthorsWhoLikeThePost;
import com.project.security.service.author.AuthorsWhoLikeThePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors_who_like_the_post")
public class AuthorsWhoLikeThePostController {
    private final AuthorsWhoLikeThePostService authorsWhoLikeThePostService;

    @Autowired
    public AuthorsWhoLikeThePostController(AuthorsWhoLikeThePostService authorsWhoLikeThePostService) {
        this.authorsWhoLikeThePostService = authorsWhoLikeThePostService;
    }

    @PostMapping
    public AuthorsWhoLikeThePost createAuthorsWhoLikeThePost(@RequestBody AuthorsWhoLikeThePost authorsWhoLikeThePost) {
        return authorsWhoLikeThePostService.save(authorsWhoLikeThePost);
    }

    @GetMapping
    public List<AuthorsWhoLikeThePost> getAllAuthorsWhoLikeThePost() {
        return authorsWhoLikeThePostService.getAllAuthorsWhoLikeThePost();
    }

    @GetMapping("/postid/{postid}")
    public ResponseEntity<?> getAuthorsWhoLikeThePostByPostid(@PathVariable Long postid) {
        if (postid == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoLikeThePost> authorsWhoLikeThePost = authorsWhoLikeThePostService.getAuthorsWhoLikeThePostByPostid(postid);
        if (!authorsWhoLikeThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoLikeThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<?> getAuthorsWhoLikeThePostByAuthor(@PathVariable String author) {
        if (author == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoLikeThePost> authorsWhoLikeThePost = authorsWhoLikeThePostService.getAuthorsWhoLikeThePostByAuthor(author);
        if (!authorsWhoLikeThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoLikeThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/authors_who_like_the_post/{authors_who_like_the_post}")
    public ResponseEntity<?> getAuthorsWhoLikeThePostByAuthorsWhoLikeThePost(@PathVariable String authors_who_like_the_post) {
        if (authors_who_like_the_post == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoLikeThePost> authorsWhoLikeThePost = authorsWhoLikeThePostService.getAuthorsWhoLikeThePostByAuthorsWhoLikeThePost(authors_who_like_the_post);
        if (!authorsWhoLikeThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoLikeThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

