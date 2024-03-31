package com.project.security.controller.author;

import com.project.security.entity.author.AuthorsWhoShareThePost;
import com.project.security.service.author.AuthorsWhoShareThePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors_who_share_the_post")
public class AuthorsWhoShareThePostController {
    private final AuthorsWhoShareThePostService service;

    @Autowired
    public AuthorsWhoShareThePostController(AuthorsWhoShareThePostService service) {
        this.service = service;
    }

    @PostMapping
    public AuthorsWhoShareThePost createAuthorsWhoShareThePost(@RequestBody AuthorsWhoShareThePost authorsWhoShareThePost) {
        return service.save(authorsWhoShareThePost);
    }

    @GetMapping
    public List<AuthorsWhoShareThePost> getAllAuthorsWhoShareThePost() {
        return service.getAllAuthorsWhoShareThePost();
    }

    @GetMapping("/postid/{postid}")
    public ResponseEntity<?> getAuthorsWhoShareThePostByPostid(@PathVariable Long postid) {
        if (postid == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoShareThePost> authorsWhoShareThePost = service.getAuthorsWhoShareThePostByPostid(postid);
        if (!authorsWhoShareThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoShareThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<?> getAuthorsWhoShareThePostByAuthor(@PathVariable String author) {
        if (author == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoShareThePost> authorsWhoShareThePost = service.getAuthorsWhoShareThePostByAuthor(author);
        if (!authorsWhoShareThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoShareThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/authors_who_share_the_post/{authors_who_share_the_post}")
    public ResponseEntity<?> getAuthorsWhoShareThePostByAuthorsWhoShareThePost(@PathVariable String authors_who_share_the_post) {
        if (authors_who_share_the_post == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoShareThePost> authorsWhoShareThePost = service.getAuthorsWhoShareThePostByAuthorsWhoShareThePost(authors_who_share_the_post);
        if (!authorsWhoShareThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoShareThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
